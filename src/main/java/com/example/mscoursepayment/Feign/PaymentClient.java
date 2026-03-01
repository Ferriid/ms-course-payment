package com.example.mscoursepayment.Feign;
import com.example.mscoursepayment.Feign.Client.CardRequestDto;
import com.example.mscoursepayment.Feign.Client.CardResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient (name = "ms-card", url = "http://localhost:8082")
public interface PaymentClient {
    @PutMapping("/payment")
    CardResponseDto payment (@RequestBody CardRequestDto request);
}
