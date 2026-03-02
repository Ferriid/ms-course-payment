package com.example.mscoursepayment.Controller;

import com.example.mscoursepayment.Dto.PaymentRequestDto;
import com.example.mscoursepayment.Feign.Client.CardResponseDto;
import com.example.mscoursepayment.Service.CoursePaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/payment")
public class CoursePaymentController {
    private final CoursePaymentService coursePaymentService;

    @PutMapping
    public CardResponseDto cardPayment(@Valid @RequestBody PaymentRequestDto paymentRequestDto) {
       return coursePaymentService.payment(paymentRequestDto);
    }
  }
