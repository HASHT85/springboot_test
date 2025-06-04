CREATE TABLE IF NOT EXISTS students (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    mail VARCHAR(255),
    school VARCHAR(255)
);

INSERT INTO students (firstname, lastname, mail, school) VALUES
    ('John', 'Doe', 'john.doe@example.com', 'EPSI'),
    ('Jane', 'Smith', 'jane.smith@example.com', 'EPSI');
