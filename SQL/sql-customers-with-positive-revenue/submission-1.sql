-- Write your query below
Select customer_id
from customers
group by customer_id, year having year = 2020 and revenue > 0;