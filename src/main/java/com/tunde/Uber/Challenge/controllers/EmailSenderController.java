package com.tunde.Uber.Challenge.controllers;

import com.tunde.Uber.Challenge.application.EmailSenderService;
import com.tunde.Uber.Challenge.core.EmailRequest;
import com.tunde.Uber.Challenge.core.exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {
    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderController(EmailSenderService emailSenderService){
        this.emailSenderService = emailSenderService;
    }

    @PostMapping()
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) throws Exception {
        this.emailSenderService.sendEmail(request.to(), request.subject(), request.body());
        return ResponseEntity.status(HttpStatus.OK).body("Email send successfully");
    }
}
