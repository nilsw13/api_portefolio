CREATE TABLE IF NOT EXISTS projects (
                                        id BIGSERIAL PRIMARY KEY,
                                        project_name VARCHAR(255) NOT NULL,
                                        project_description TEXT,
                                        project_link VARCHAR(255),
                                        image_url_1 VARCHAR(255),
                                        image_url_2 VARCHAR(255),
                                        backend_stack VARCHAR(255),
                                        frontend_stack VARCHAR(255),
                                        database_stack VARCHAR(255),
                                        backend_deployment_stack VARCHAR(255),
                                        frontend_deployment_stack VARCHAR(255),
                                        visible BOOLEAN
);