-- YOUR SOLUTION HERE
SELECT DISTINCT ship_country
FROM orders
WHERE EXTRACT(YEAR FROM shipped_date) BETWEEN 1997 AND 1998
  AND (ship_country LIKE '%S%' OR ship_country LIKE '%s%')
