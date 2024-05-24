select b.book_id, a.author_name, left(b.published_date, 10) from book b join author a on b.author_id = a.author_id
where b.category = '경제'
order by b.published_date