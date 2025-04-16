
package com.example.typingspeedtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypingTestService {

    @Autowired
    private TypingTestRepository repository;

    public TypingTestResult saveResult(TypingTestResult result) {
        return repository.save(result);
    }

    public List<TypingTestResult> getAllResults() {
        return repository.findAll();
    }
}
