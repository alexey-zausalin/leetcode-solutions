select u.NAME, sum(t.amount) as BALANCE
from users u
join transactions t on t.account = u.account
group by t.account
having sum(t.amount) > 10000
