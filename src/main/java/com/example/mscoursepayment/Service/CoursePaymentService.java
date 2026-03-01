package com.example.mscoursepayment.Service;


import com.example.mscoursepayment.Dto.PaymentRequestDto;
import com.example.mscoursepayment.Entity.PaymentEntity;
import com.example.mscoursepayment.Enums.PaymentStatus;
import com.example.mscoursepayment.Feign.Client.CardResponseDto;
import com.example.mscoursepayment.Feign.PaymentClient;
import com.example.mscoursepayment.Mapper.PaymentRequestToCardRequest;
import com.example.mscoursepayment.Mapper.PaymentRequestToEntity;
import com.example.mscoursepayment.Repository.CoursePaymentRepository;
import feign.FeignException;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CoursePaymentService {
    private final CoursePaymentRepository coursePaymentRepository;
    private final PaymentClient paymentClient;

    public CardResponseDto payment(PaymentRequestDto request) {
        var paymentEntity = new PaymentEntity();
        var cardRequest = PaymentRequestToCardRequest.paymentRequestToCardRequest(request);
        paymentEntity.setPaymentId(UUID.randomUUID().toString().replace("-", "").substring(0, 7).toUpperCase(Locale.ROOT));
        PaymentRequestToEntity.paymentRequestToPaymentEntity(request, paymentEntity);
        try {
            paymentClient.payment(cardRequest);
            paymentEntity.setPaymentStatus(PaymentStatus.ACCEPTED);
            coursePaymentRepository.save(paymentEntity);

        } catch (FeignException a) {
            paymentEntity.setPaymentStatus(PaymentStatus.CANCELED);
            coursePaymentRepository.save(paymentEntity);
            if (a.status() == 404) {
                return new CardResponseDto("Card not found..");
            }
            if (a.status() == 400) {
                return new CardResponseDto("Canceled - Not enough balance");
            }
            if (a.status() == 409) {
                return new CardResponseDto("Card info is wrong..");
            }
        }
        return new CardResponseDto("Payment successful");
    }
}
