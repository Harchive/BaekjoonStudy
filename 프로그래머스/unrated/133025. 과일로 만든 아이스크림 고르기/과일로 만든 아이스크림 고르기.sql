-- 코드를 입력하세요
SELECT f.flavor from FIRST_HALF f, ICECREAM_INFO i
where f.flavor = i.flavor and i.INGREDIENT_TYPE in('fruit_based')
and f.total_order >3000
order by f.total_order desc;