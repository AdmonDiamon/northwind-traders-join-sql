-- YOUR SOLUTION HERE
select * from orders o
where ship_country = 'Sweden' and extract (year from shipped_date) = 1997
order by employee_id