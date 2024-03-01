# Email Service - Uber Coding Challenge

This repository contains the solution for the email service prototype challenge as specified in the backend coding challenge. The project was developed using Java and Spring Boot.

## Functional Specification

The goal of this project is to create a service that accepts the necessary information and sends emails to recipients. The service provides an abstraction between two different email service providers, allowing for quick failover to an alternative provider in case of a primary provider failure.

### Implemented Features:

-   Acceptance of necessary information for sending emails.
-   RESTful endpoint for sending emails.

### Technologies Used:

-   Java 17
-   Spring Boot 3.2.3
-   Maven for dependency management
-   Spring Mail for sending emails

## Usage

To use this service, follow these steps:

1. Clone the repository to your local machine.
2. Configure your Gmail account credentials in the `application.properties` file.
3. Build the project using Maven.
4. Run the application.

## How to Send Emails

To send emails using this service, make a POST request to the appropriate endpoint with the email details in the request body. Here's an example using cURL:

```bash
curl -X POST \
  http://localhost:8080/api/email \
  -H 'Content-Type: application/json' \
  -d '{
    "to": "recipient@example.com",
    "subject": "Test Email",
    "body": "This is a test email sent from the Gmail Email Service."
}'

```

## Note:

Feel free to explore the source code and reach out in case of any questions or feedback. Thank you for reviewing my solution!
