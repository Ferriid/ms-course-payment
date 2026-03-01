package com.example.mscoursepayment.Dto;

import com.example.mscoursepayment.Enums.PaymentStatus;
import com.example.mscoursepayment.Feign.Client.CardResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponseDto {
    private Long studentId;
    private Double paidAmount;
    private PaymentStatus paymentStatus;
    private Double paymentId;
    private CardResponseDto cardResponseDto;
    @CreationTimestamp
    private LocalDateTime paymentTime;
}
