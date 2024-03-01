package com.tunde.Uber.Challenge.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body) throws Exception;
}
