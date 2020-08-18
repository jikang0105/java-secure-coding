SELECT COUNT(*)FROM product;
-- id로 검색해서 상품이 존재하는지 유무를 판단
SELECT COUNT(*) FROM product WHERE id='d'; -- 없으면 0을 반환한다.
SELECT COUNT(*) FROM product WHERE id='2'; -- 있으면 1을 반환한다.