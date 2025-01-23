package com.nilsw13.myportefolio.services;


import com.nilsw13.myportefolio.dtos.MessageRequestDto;
import com.nilsw13.myportefolio.models.Messages;
import com.nilsw13.myportefolio.repositories.MessageRepository;
import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Messages send(MessageRequestDto dto) {

        Messages message = new Messages();
        message.setSenderName(dto.getName());
        message.setSenderEmail(dto.getEmail());
        message.setMessage(dto.getMessage());
        message.setSenderCompany(dto.getCompany());
        message.setSenderPhone(dto.getPhone());

        messageRepository.save(message);
        return message;
    }
}
