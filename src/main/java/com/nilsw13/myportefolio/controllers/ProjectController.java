package com.nilsw13.myportefolio.controllers;


import com.nilsw13.myportefolio.models.Messages;
import com.nilsw13.myportefolio.models.Projects;
import com.nilsw13.myportefolio.services.ProjectService;
import org.aspectj.bridge.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/projects")

public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Projects>> listProjects() {
        return ResponseEntity.ok(projectService.listProjects());

    }


}
