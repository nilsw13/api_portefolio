package com.nilsw13.myportefolio.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "projects")
@Getter
@Setter
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "project_name", nullable = false)
    private String projectName;

    @Column(name = "project_description")
    private String projectDescription;

    @Column(name = "backend_stack")
    private String backendStack;

    @Column(name = "frontend_stack")
    private String frontendStack;

    @Column(name = "database_stack")
    private String databaseStack;

    @Column(name = "backend_deployment_stack")
    private String backendDeploymentStack;

    @Column(name = "frontend_deployment_stack")
    private String frontendDeploymentStack;

    @Column(name = "project_link")
    private String projectLink;

    @Column(name = "image_url_1")
    private String imageUrl1;

    @Column(name = "image_url_2")
    private String imageUrl2;

    @Column(name = "visible")
    private boolean visible;
}