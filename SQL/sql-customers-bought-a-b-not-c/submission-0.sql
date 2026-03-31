-- Write your query below

select c.customer_id, c.customer_name
from customers c
where customer_id IN (
    select o.customer_id
    from orders o
    where o.product_name = 'A'
) AND
customer_id IN (
    select o.customer_id
    from orders o
    where o.product_name = 'B'
) AND
customer_id NOT IN (
    select o.customer_id
    from orders o
    where o.product_name = 'C'
)
order by c.customer_name asc;