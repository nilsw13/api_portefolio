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

    @Column(name = "backend_deployment_stack")
    private String backendDeploymentStack;

    @Column(name = "frontend_deployment_stack")
    private String frontendDeploymentStack;

    @Column(name = "visible")
    private boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectLink() {
        return projectLink;
    }

    public void setProjectLink(String projectLink) {
        this.projectLink = projectLink;
    }

    public String getImageS3Url() {
        return imageS3Url;
    }

    public void setImageS3Url(String imageS3Url) {
        this.imageS3Url = imageS3Url;
    }

    public String getBackendStack() {
        return backendStack;
    }

    public void setBackendStack(String backendStack) {
        this.backendStack = backendStack;
    }

    public String getFrontendStack() {
        return frontendStack;
    }

    public void setFrontendStack(String frontendStack) {
        this.frontendStack = frontendStack;
    }

    public String getDatabaseStack() {
        return databaseStack;
    }

    public void setDatabaseStack(String databaseStack) {
        this.databaseStack = databaseStack;
    }

    public String getBackendDeploymentStack() {
        return backendDeploymentStack;
    }

    public void setBackendDeploymentStack(String backendDeploymentStack) {
        this.backendDeploymentStack = backendDeploymentStack;
    }

    public String getFrontendDeploymentStack() {
        return frontendDeploymentStack;
    }

    public void setFrontendDeploymentStack(String frontendDeploymentStack) {
        this.frontendDeploymentStack = frontendDeploymentStack;
    }


}
