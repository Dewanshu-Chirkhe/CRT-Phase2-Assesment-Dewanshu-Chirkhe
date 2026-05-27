package com.post.test.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

// Q13: Resilience4j circuit breaker with RestTemplate and a basic fallback.
@Service
public class PaymentService {

    private final RestTemplate restTemplate;

    public PaymentService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @CircuitBreaker(name = "paymentService", fallbackMethod = "paymentFallback")
    public PaymentResponse getPaymentStatus() {
        return restTemplate.getForObject("http://payment-service/api/payments/status", PaymentResponse.class);
    }

    public PaymentResponse paymentFallback(Throwable throwable) {
        return new PaymentResponse("FAILED", "Payment service is unavailable");
    }
}
