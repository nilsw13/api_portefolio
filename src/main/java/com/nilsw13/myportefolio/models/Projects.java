package com.nilsw13.myportefolio.models;


import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "project_name" , nullable = false)
    private String projectName;

    @Column(name = "project_description")
    private String projectDescription;

    @Column(name = "project_link")
    private String projectLink;

    @Column(name = "image_s3_url")
    private String imageS3Url;

    @Column(name = "backend_stack")
    private String backendStack;

    @Column(name = "frontend_stack")
    private String frontendStack;

    @Column(name = "database_stack")
    private String databaseStack;

    @Column(name = "deployment_stack")
    private String deploymentStack;
}
