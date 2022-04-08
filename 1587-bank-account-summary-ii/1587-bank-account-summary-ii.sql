select u.name, sum(t.amount) as balance
from users u
join transactions t on t.account = u.account
group by t.account
having balance > 10000
