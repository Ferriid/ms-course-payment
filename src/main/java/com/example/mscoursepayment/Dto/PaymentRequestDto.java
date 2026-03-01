package com.example.mscoursepayment.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequestDto {
    private String studentId;
    private String pan;
    private String cvv;
    private String password;
    private Double paidAmount;
}
