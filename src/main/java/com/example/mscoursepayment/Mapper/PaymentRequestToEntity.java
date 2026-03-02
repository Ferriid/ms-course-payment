package com.example.mscoursepayment.Mapper;

import com.example.mscoursepayment.Dto.PaymentRequestDto;
import com.example.mscoursepayment.Entity.PaymentEntity;

public class PaymentRequestToEntity {
    public static void paymentRequestToPaymentEntity(PaymentRequestDto paymentRequestDto, PaymentEntity paymentEntity) {
        paymentEntity.setStudentId(paymentRequestDto.getStudentId());
        paymentEntity.setPaidAmount(paymentRequestDto.getPaidAmount());
        paymentEntity.setPan(paymentRequestDto.getPan());
    }
}
