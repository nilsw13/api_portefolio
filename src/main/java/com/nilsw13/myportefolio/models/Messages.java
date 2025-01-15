package com.nilsw13.myportefolio.models;


import jakarta.persistence.*;

@Entity
@Table(name = "messages")
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "sender_name" , nullable = false)
    private String senderName;

    @Column(name = "sender_company")
    private String senderCompany;

    @Column(name = "sender_email", nullable = false)
    private String senderEmail;

    @Column(name = "sender_phone")
    private String senderPhone;


    @Column(name = "message", nullable = false)
    private String message;


}
