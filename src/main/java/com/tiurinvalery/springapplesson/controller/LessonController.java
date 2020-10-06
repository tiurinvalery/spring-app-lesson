package com.tiurinvalery.springapplesson.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LessonController {

    @GetMapping("/")
    public ResponseEntity<String> getLessons() {
        return new ResponseEntity<>("Hello in our lessosns", HttpStatus.OK);
    }
}
