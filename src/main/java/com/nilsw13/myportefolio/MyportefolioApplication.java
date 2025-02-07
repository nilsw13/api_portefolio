package com.nilsw13.myportefolio;

import com.nilsw13.myportefolio.models.Projects;
import com.nilsw13.myportefolio.repositories.ProjectRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyportefolioApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyportefolioApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(ProjectRepository projectRepository ) {
        return args -> {


            if (projectRepository.count() > 0) {
                System.out.println("Projects already exist");
                return;
            }

            Projects project1 = new Projects();

            project1.setProjectName("Studio Headshot Project");
            project1.setProjectDescription("A SaaS platform that allows people to generate professional headshot photos with AI.Makes them save time and money.");
            project1.setBackendStack("Java - Spring Boot");
            project1.setFrontendStack("ReactJs - Vite");
            project1.setDatabaseStack("PostgreSQL");
            project1.setBackendDeploymentStack("Heroku");
            project1.setFrontendDeploymentStack("Netlify");
            project1.setProjectLink("https://studioheadshotpro.com");
            project1.setImageUrl1("/projectIllustration/studioheadshotpro1.png");
            project1.setImageUrl2("/projectIllustration/studioheadshotpro2.png");
            project1.setVisible(true);

            projectRepository.save(project1);


            Projects project2 = new Projects();
            project2.setProjectName("KM CHANGE");
            project2.setProjectDescription("A Money exchange shop and metals investment.");
            project2.setBackendStack("Java - Spring Boot");
            project2.setFrontendStack("thymeleaf - htmx");
            project2.setDatabaseStack("PostgreSQL");
            project2.setBackendDeploymentStack("Heroku");
            project2.setFrontendDeploymentStack("Heroku");
            project2.setProjectLink("https://www.kmchange.fr/");
            project2.setImageUrl1("/projectIllustration/kmchange1.png");
            project2.setImageUrl2("/projectIllustration/kmchange2.png");
            project2.setVisible(true);

            projectRepository.save(project2);


            Projects project3 = new Projects();
            project3.setProjectName("Java Top Tools");
            project3.setProjectDescription("A Spring Boot REST API that fetches and serves information about the most popular Java repositories on GitHub");
            project3.setBackendStack("Java");
            project3.setFrontendStack("ReactJs - Vite");
            project3.setDatabaseStack("None");
            project3.setBackendDeploymentStack("Railway");
            project3.setFrontendDeploymentStack("Vercel");
            project3.setProjectLink("https://java-top-tools-front.vercel.app/");
            project3.setProjectRepoLink("https://github.com/nilsw13/JavaTopTools_api");
            project3.setImageUrl1("/projectIllustration/javatoptools1.png");
            project3.setImageUrl2("/projectIllustration/javatoptools2.png");
            project3.setVisible(true);


            projectRepository.save(project3);


            Projects project4 = new Projects();
            project4.setProjectName("Portfolio");
            project4.setProjectDescription("A portfolio website that showcases my projects and skills.");
            project4.setBackendStack("Java - Spring Boot");
            project4.setFrontendStack("ReactJs - Vite");
            project4.setDatabaseStack("PostgreSQL");
            project4.setBackendDeploymentStack("Heroku");
            project4.setFrontendDeploymentStack("Netlify");
            project4.setProjectLink("https://nilswenting.com/");
            project4.setProjectRepoLink("https://github.com/nilsw13/frontend_portefolio");
            project4.setImageUrl1("/projectIllustration/portfolio1.png");
            project4.setImageUrl2("/projectIllustration/portfolio2.png");
            project4.setVisible(true);

            projectRepository.save(project4);
        };
    }

}
