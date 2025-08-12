package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void greet_returnsHelloName() {
        assertEquals("Hello, Alice!", App.greet("Alice"));
    }
}
