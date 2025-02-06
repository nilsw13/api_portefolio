package com.nilsw13.myportefolio.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter

@Setter
@Entity
@Table(name = "projects")
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "project_name" , nullable = false)
    private String projectName;

    @Column(name = "project_description")
    private String projectDescription;

    @Column(name = "project_link")
    private String projectLink;



    @Column(name = "image_url_1")
    private String imageUrl1;

    public void setId(Long id) {
        this.id = id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public void setProjectLink(String projectLink) {
        this.projectLink = projectLink;
    }

    public void setImageUrl1(String imageUrl1) {
        this.imageUrl1 = imageUrl1;
    }

    public void setImageUrl2(String imageUrl2) {
        this.imageUrl2 = imageUrl2;
    }

    public void setBackendStack(String backendStack) {
        this.backendStack = backendStack;
    }

    public void setFrontendStack(String frontendStack) {
        this.frontendStack = frontendStack;
    }

    public void setDatabaseStack(String databaseStack) {
        this.databaseStack = databaseStack;
    }

    public void setBackendDeploymentStack(String backendDeploymentStack) {
        this.backendDeploymentStack = backendDeploymentStack;
    }

    public void setFrontendDeploymentStack(String frontendDeploymentStack) {
        this.frontendDeploymentStack = frontendDeploymentStack;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Column(name = "image_url_2")
    private String imageUrl2;

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

    @Column(name = "visible")
    private boolean visible;






}
