package com.tunde.Uber.Challenge.adapters;


public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body) throws Exception;
}
