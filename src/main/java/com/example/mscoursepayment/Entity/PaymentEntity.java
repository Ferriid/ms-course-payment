package com.example.mscoursepayment.Entity;

import com.example.mscoursepayment.Enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "payment")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_id", nullable = false)
    private String studentId;

    @Column(name = "pan", nullable = false)
    private String pan;


    @Column(name = "paid_amount")
    private Double paidAmount;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_status")
    private PaymentStatus paymentStatus;

    @Column(name = "payment_id",  nullable = false, unique = true)
    private String paymentId;

    @CreationTimestamp
    @Column(name = "payment_time", nullable = false)
    private LocalDateTime paymentTime;

}
