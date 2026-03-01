package com.example.mscoursepayment.Repository;

import com.example.mscoursepayment.Entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursePaymentRepository extends JpaRepository<PaymentEntity, Long> {

}
