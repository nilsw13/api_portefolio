package com.nilsw13.myportefolio.services;

import com.nilsw13.myportefolio.models.Projects;
import com.nilsw13.myportefolio.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {


    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Projects> listProjects() {
        // call repository to get all projects in a list
        return projectRepository.findAll();

    }


}
