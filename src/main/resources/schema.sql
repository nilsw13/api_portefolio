CREATE TABLE IF NOT EXISTS projects (
                                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                                        project_name TEXT NOT NULL,
                                        project_description TEXT,
                                        backend_stack TEXT,
                                        frontend_stack TEXT,
                                        database_stack TEXT,
                                        backend_deployment_stack TEXT,
                                        frontend_deployment_stack TEXT,
                                        project_link TEXT,
                                        image_url_1 TEXT,
                                        image_url_2 TEXT,
                                        visible INTEGER DEFAULT 0
);