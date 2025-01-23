package com.nilsw13.myportefolio.controllers;


import com.nilsw13.myportefolio.dtos.MessageRequestDto;
import com.nilsw13.myportefolio.models.Messages;
import com.nilsw13.myportefolio.repositories.MessageRepository;
import com.nilsw13.myportefolio.services.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/messages")
public class MessageController {

    private final MessageRepository messageRepository;
    private final MessageService messageService;

    public MessageController(MessageRepository messageRepository, MessageService messageService) {
        this.messageRepository = messageRepository;
        this.messageService = messageService;
    }

    @PostMapping("/send")
    public ResponseEntity<Messages> sendMessage(@RequestBody MessageRequestDto req) {
       Messages message = messageService.send(req);
        return ResponseEntity.ok(message);
    }


}
