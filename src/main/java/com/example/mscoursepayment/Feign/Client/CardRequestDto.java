package com.example.mscoursepayment.Feign.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardRequestDto {
    private String pan;
    private String cvv;
    private String password;
    private Double amount;
}
