CREATE TABLE `user`
(
    id        bigint(20) NOT NULL AUTO_INCREMENT,
    first_name varchar(255) NOT NULL,
    last_name  varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE question
(
    id        bigint(20) NOT NULL AUTO_INCREMENT,
    question_text varchar(255) NOT NULL,
    PRIMARY KEY (id)
)
