package com.paymentservice.paymentservice.repo;

import com.paymentservice.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo  extends JpaRepository<Payment,Integer> {



}
