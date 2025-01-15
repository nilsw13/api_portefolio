package com.nilsw13.myportefolio.repositories;

import com.nilsw13.myportefolio.models.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Messages, Long> {

            //implement custom differents queries here if needed later

    public Messages findBySenderEmail(String email);

    public Messages findBySenderName(String name);

    public Messages findBySenderCompany(String company);

}
