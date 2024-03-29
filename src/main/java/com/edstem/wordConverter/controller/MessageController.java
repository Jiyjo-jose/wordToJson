package com.edstem.wordConverter.controller;

import com.edstem.wordConverter.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/word")
@RequiredArgsConstructor
public class MessageController {
    private final ProducerService producerService;

    @PostMapping("/upload")
    public String upload(@RequestParam("file")MultipartFile file) throws Exception{
        producerService.upload(file);
        return "File uploaded successfully";

    }
}
