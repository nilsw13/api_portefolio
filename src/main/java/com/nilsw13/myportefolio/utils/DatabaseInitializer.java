package com.nilsw13.myportefolio.utils;

import com.nilsw13.myportefolio.models.Messages;
import com.nilsw13.myportefolio.models.Projects;
import com.nilsw13.myportefolio.repositories.MessageRepository;
import com.nilsw13.myportefolio.repositories.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final ProjectRepository projectRepository;

    public DatabaseInitializer(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        // verify if the database is empty

        if (projectRepository.count() > 0) {
            System.out.println("Database already initialized");
            return ;
        }

        // create my projects in the database at the start of the application

        Projects project1 = new Projects();

        project1.setProjectName("Studio Headshot Project");
        project1.setProjectDescription("A SaaS platform that allows people to generate professional headshot photos with AI.Makes them save time and money.");
        project1.setBackendStack("Java - Spring Boot");
        project1.setFrontendStack("ReactJs - Vite");
        project1.setDatabaseStack("PostgreSQL");
        project1.setBackendDeploymentStack("Heroku");
        project1.setFrontendDeploymentStack("Vercel");
        project1.setProjectLink("https://photocv-frontend.vercel.app/");

        projectRepository.save(project1);


        Projects project2 = new Projects();
        project2.setProjectName("KM CHANGE");
        project2.setProjectDescription("A Website that for a company that offers services in the field of money exchange and metals investment.");
        project2.setBackendStack("Java - Spring Boot");
        project2.setFrontendStack("thymeleaf - htmx");
        project2.setDatabaseStack("PostgreSQL");
        project2.setBackendDeploymentStack("Heroku");
        project2.setFrontendDeploymentStack("Heroku");
        project2.setProjectLink("https://www.kmchange.fr/");

        projectRepository.save(project2);


        Projects project3 = new Projects();
        project3.setProjectName("Open source Java client for Replicate API");
        project3.setProjectDescription("A Java client for Replicate API that developpers users to interact with the Replicate API in a simple way.");
        project3.setBackendStack("Java - Spring Boot");
        project3.setBackendDeploymentStack("Maven Central");


        projectRepository.save(project3);


        Projects project4 = new Projects();
        project4.setProjectName("Portfolio");
        project4.setProjectDescription("A portfolio website that showcases my projects and skills.");
        project4.setBackendStack("Java - Spring Boot");
        project4.setFrontendStack("ReactJs - Vite");
        project4.setDatabaseStack("PostgreSQL");
        project4.setBackendDeploymentStack("Heroku");
        project4.setFrontendDeploymentStack("Vercel");
        project4.setProjectLink("https://nilsw13.github.io/");

        projectRepository.save(project4);













    }
}
