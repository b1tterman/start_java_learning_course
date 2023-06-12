select * from Jaegers;
select * FROM Jaegers where status <> 'Destroyed';
SELECT * FROM Jaegers where mark = 'Mark-1' or mark = 'Mark-6';
SELECT * FROM Jaegers ORDER BY mark DESC;
SELECT * FROM Jaegers where launch = (SELECT min(launch) from Jaegers);
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT min(kaijuKill) from Jaegers) or kaijuKill = (SELECT max(kaijuKill) from Jaegers);
SELECT avg(weight) FROM Jaegers; 
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 where status = 'Active';
DELETE FROM Jaegers WHERE status = 'Destroyed';

