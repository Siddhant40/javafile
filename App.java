package com.example;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Main application class.
 */
public class App {
    public static void main(String[] args) {
        String message = "Hello, Maven with Jenkins!";
        if (StringUtils.isNotBlank(message)) {
            System.out.println("Message: " + message);
        } else {
            System.out.println("Message is blank.");
        }
    }

    /**
     * Unit test for the App class.
     */
    public static class AppTest {
        @Test
        public void testApp() {
            String testString = "Hello, Test!";
            assertTrue("String should not be empty", testString.length() > 0);
        }
    }
}
