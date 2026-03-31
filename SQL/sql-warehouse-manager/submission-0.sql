-- Write your query below
select w.name as warehouse_name, SUM(w.units * p.width * p.length * p.height) as volume
from warehouse w
join products p ON p.product_id = w.product_id
group by w.name;