select order_id, shipped_date from orders o
where EXTRACT(YEAR FROM shipped_date) = 1996 AND EXTRACT(MONTH FROM shipped_date) = 8;