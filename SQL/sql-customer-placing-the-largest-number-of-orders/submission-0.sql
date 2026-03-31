-- Write your query below
select customer_number
from orders
group by customer_number
ORDER BY COUNT(*) DESC
LIMIT 1;
