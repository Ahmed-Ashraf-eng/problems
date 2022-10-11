# Write your MySQL query statement below
select IFNULL (
    (select DISTINCT salary from employee order by salary desc LIMIT 1, 1) , NULL) as SecondHighestSalary