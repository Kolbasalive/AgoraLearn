package org.kolbasa.agoralearn.adapter.rest;

import org.kolbasa.agoralearn.domain.Lesson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lesson")
public class LessonController {
    @GetMapping
    public Lesson getLesson(){
        return new Lesson("Hello, lesson");
    }
}