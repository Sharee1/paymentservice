package com.paymentservice.paymentservice.service;

import com.paymentservice.paymentservice.entity.Payment;
import com.paymentservice.paymentservice.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepo paymentRepository;




    // Method to save a payment
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    // Method to retrieve a payment by ID
    public Optional<Payment> getPaymentById(int paymentId) {
        return paymentRepository.findById(paymentId);
    }

    // Method to retrieve all payments
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Method to update a payment
    public Payment updatePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public void deletePayment(int paymentId) {
        paymentRepository.deleteById(paymentId);
    }
}
