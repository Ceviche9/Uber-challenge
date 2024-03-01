package com.tunde.Uber.Challenge.core;

public record EmailRequest(
        String to,
        String subject,
        String body
) {
}
