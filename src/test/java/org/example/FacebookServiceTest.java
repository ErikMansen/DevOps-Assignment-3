package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacebookServiceTest {

    private FacebookService service;

    @BeforeEach
    public void setUp() {
        service = new FacebookService();
    }

    @Test
    public void testValidProfile() {
        String[] friends = service.fetchFacebookFriends("validProfileLink");
        assertNotNull(friends);
        assertTrue(friends.length > 0);
    }

    @Test
    public void testInvalidProfile() {
        assertThrows(IllegalArgumentException.class, () -> service.fetchFacebookFriends("invalid"));
    }

    @Test
    public void testPerformance() {
        long start = System.currentTimeMillis();
        service.fetchFacebookFriends("validProfileLink");
        long end = System.currentTimeMillis();
        assertTrue(end - start < 5000);
    }
}
