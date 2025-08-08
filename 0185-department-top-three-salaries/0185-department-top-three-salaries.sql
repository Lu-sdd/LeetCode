SELECT d.name AS Department, e.name AS Employee, e. salary AS Salary
FROM (
    SELECT *, 
            DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS rnk
    FROM Employee 
) e
LEFT JOIN Department d on e.departmentId = d.id
WHERE rnk <= 3

