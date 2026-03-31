-- Write your query below

select employee_id,
CASE 
WHEN name not like 'M%' and employee_id % 2 = 1
THEN salary
ELSE 0
END as bonus
from employees
ORDER BY employee_id;