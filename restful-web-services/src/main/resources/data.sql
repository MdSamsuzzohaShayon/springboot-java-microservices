INSERT INTO user_details(id, birthdate, name) VALUES (1001, current_date(), 'Shayon');
INSERT INTO user_details(id, birthdate, name) VALUES (1002, current_date(), 'Shayon 2');
INSERT INTO user_details(id, birthdate, name) VALUES (1003, current_date(), 'Shayon 3');

INSERT INTO post(id, description, user_id) VALUES (2003, 'desc 1', 1001);
INSERT INTO post(id, description, user_id) VALUES (2004, 'desc 2', 1001);
INSERT INTO post(id, description, user_id) VALUES (2005, 'desc 3', 1003);