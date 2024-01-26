select distinct ship_country AS ship_country_97
from orders o
where extract (year from shipped_date) = 1997
order by ship_country_97