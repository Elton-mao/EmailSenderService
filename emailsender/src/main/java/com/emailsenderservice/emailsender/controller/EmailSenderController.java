package com.emailsenderservice.emailsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emailsenderservice.emailsender.core.DTO.EmailSenderDTO;
import com.emailsenderservice.emailsender.core.service.EmailSenderService;

@RestController
@RequestMapping("/senderemail")
public class EmailSenderController {

    @Autowired
    private EmailSenderService emailSenderService;

    @PostMapping
    public ResponseEntity<EmailSenderDTO> emailSender(@RequestBody EmailSenderDTO data){
        this.emailSenderService.emailsender(data.emailTo(), data.subject(),data.body());
        return ResponseEntity.ok().body(data);
    }

}
