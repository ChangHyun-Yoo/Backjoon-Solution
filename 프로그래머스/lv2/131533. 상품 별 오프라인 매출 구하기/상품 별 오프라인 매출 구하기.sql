-- 코드를 입력하세요
select p.product_code, p.price * o.sum from (SELECT product_id, sum(sales_amount) as 'sum' from offline_sale group by product_id) o left join product p on p.product_id = o.product_id order by p.price * o.sum desc, p.product_code asc