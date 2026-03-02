package com.example.mscoursepayment.Scheduler;

import com.example.mscoursepayment.Service.CoursePaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PaymentStatus {

    private final CoursePaymentService corsePaymentService;

    @Scheduled(cron = "0 0 0 1 * ?")
    public void resetPayments() {
    }
}
