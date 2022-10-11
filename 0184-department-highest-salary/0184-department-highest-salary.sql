# Write your MySQL query statement below
SELECT d.name as Department  , e.name as Employee , e.salary from Employee as e join department as d on e.departmentId  = d.id
where (departmentId , salary) in
(select departmentId , max(salary) from Employee group by departmentId)