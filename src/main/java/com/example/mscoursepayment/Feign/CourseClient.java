package com.example.mscoursepayment.Feign;


import com.example.mscoursepayment.Feign.Client.CardRequestDto;
import com.example.mscoursepayment.Feign.Client.CardResponseDto;
import com.example.mscoursepayment.Feign.Client.CourseRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ms-course", url = "http://localhost:7575")
public interface CourseClient {
    @PutMapping("/studentpayment")
    void studentPay (@RequestBody CourseRequestDto request);
}
