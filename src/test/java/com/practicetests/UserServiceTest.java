package com.practicetests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class UserServiceTest {

    EmailService emailService = mock(EmailService.class);
    UserService userService = new UserService(emailService);

    @Test
    void registerUser_whenEmailContainsAtSign_thenReturnTrue() {
        boolean expectedResult = userService.registerUser("abc@xyz");
        assertTrue(expectedResult);
        verify(emailService, times(1)).sendWelcomeEmail("abc@xyz");
    }

    
}