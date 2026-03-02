package com.example.mscoursepayment.Dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequestDto {

    @Size(min = 7, max = 7 , message = "id must be 7 symbols" )
    private String studentId;

    @Size(min = 16, max = 16, message = "Wrong pan")
    private String pan;

    @Size(min = 3, max = 3, message = "Wrong CVV")
    private String cvv;

    @Size(min = 4, max = 4, message = "Wrong password")
    private String password;

    private Double paidAmount;
}
