
package com.example.typingspeedtest;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TypingTestResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int wpm;
    private int cpm;
    private int accuracy;
    private String date;

    // Getters and Setters
}
