DROP TABLE IF EXISTS data;

CREATE TABLE data
(
       `id`    INT     not null    auto_increment,
       `date`  DATE    not null,
       `total` INT     not null,
       PRIMARY KEY (id)
);

insert into data (id, date, total)
values (1, '2023-05-11', 2),
       (2, '2023-05-12', 7),
       (3, '2023-05-10', 4),
       (4, '2023-05-11', 1),
       (5, '2023-05-13', 2),
       (6, '2023-05-15', 5),
       (7, '2023-05-14', 3),
       (8, '2023-05-11', 1),
       (9, '2023-05-12', 9),
       (10, '2023-05-10', 2),
       (11, '2023-05-12', 4),
       (12, '2023-05-15', 8),
       (13, '2023-05-12', 4),
       (14, '2023-05-13', 7),
       (15, '2023-05-10', 5),
       (16, '2023-05-15', 2),
       (17, '2023-05-14', 8),
       (18, '2023-05-11', 3),
       (19, '2023-05-14', 1),
       (20, '2023-05-13', 2),
       (21, '2023-05-12', 6)
;