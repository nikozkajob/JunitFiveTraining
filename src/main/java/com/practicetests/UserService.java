package com.practicetests;

public class UserService {
    private final EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public boolean registerUser(String email) {
        if (email.contains("@")) {
            emailService.sendWelcomeEmail(email);
            return true;
        }
        return false;
    }
}
