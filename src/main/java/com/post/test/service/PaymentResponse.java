package com.post.test.service;

// Q13: Simple response class returned by PaymentService and its fallback.
public class PaymentResponse {

    private String status;
    private String message;

    public PaymentResponse() {
    }

    public PaymentResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
