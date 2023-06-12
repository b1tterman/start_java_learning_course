CREATE TABLE IF NOT EXISTS Jaegers 
(id SERIAL PRIMARY KEY, modelName VARCHAR(30), 
mark VARCHAR(15), height FLOAT, 
weight FLOAT, status VARCHAR(30), 
origin VARCHAR(25), launch DATE, kaijuKill INTEGER);