package com.tunde.Uber.Challenge.application;

import com.tunde.Uber.Challenge.adapters.EmailSenderGateway;
import com.tunde.Uber.Challenge.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) throws Exception {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
