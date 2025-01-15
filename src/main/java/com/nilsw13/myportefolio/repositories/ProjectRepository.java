package com.nilsw13.myportefolio.repositories;


import com.nilsw13.myportefolio.models.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Projects, Long> {

            //implement custom differents queries here if needed later

    public Projects findByProjectName(String name);


    public Projects findByProjectDescription(String description);


    public Projects findByBackendStack(String stack);

    public Projects findByFrontendStack(String stack);

    public Projects findByDatabaseStack(String stack);

    public Projects findByDeploymentStack(String stack);
}
