package com.tunde.Uber.Challenge.infra.JavaMail;

import com.tunde.Uber.Challenge.adapters.EmailSenderGateway;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class JavaMailSender implements EmailSenderGateway {
    @Value("${my.email}")
    private String myEmail;
    @Value("${my.password}")
    private String myPassword;

    @Override
    public void sendEmail(String to, String subject, String body) throws Exception {
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthentication(this.myEmail, this.myPassword);
        email.setSSLOnConnect(true);

        try {
            email.setFrom(this.myEmail);
            email.setSubject(subject);
            email.setMsg(body);
            email.addTo(to);
            email.send();

        } catch (Exception err) {
            err.printStackTrace();
            throw new Exception("Error while trying to send email");
        }
    }
}
