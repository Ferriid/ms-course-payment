package com.example.mscoursepayment.Mapper;

import com.example.mscoursepayment.Dto.PaymentRequestDto;
import com.example.mscoursepayment.Feign.Client.CardRequestDto;

public class PaymentRequestToCardRequest {
    public static CardRequestDto paymentRequestToCardRequest(PaymentRequestDto paymentRequestDto) {
        var cardRequestDto = new CardRequestDto();
        cardRequestDto.setPan(paymentRequestDto.getPan());
        cardRequestDto.setCvv(paymentRequestDto.getCvv());
        cardRequestDto.setPassword(paymentRequestDto.getPassword());
        cardRequestDto.setAmount(paymentRequestDto.getPaidAmount());
        return cardRequestDto;
    }
}
