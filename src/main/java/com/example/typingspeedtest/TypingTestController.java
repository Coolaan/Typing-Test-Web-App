
package com.example.typingspeedtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TypingTestController {

    @Autowired
    private TypingTestService service;

    @PostMapping("/typing-test")
    public TypingTestResult saveResult(@RequestBody TypingTestResult result) {
        return service.saveResult(result);
    }

    @GetMapping("/typing-history")
    public List<TypingTestResult> getAllResults() {
        return service.getAllResults();
    }
}
