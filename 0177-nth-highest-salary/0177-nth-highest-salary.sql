CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE start  INT unsigned DEFAULT N - 1;
    RETURN (
          # Write your MySQL query statement below.
          select DISTINCT salary from employee order by salary desc LIMIT start ,1
      );
END