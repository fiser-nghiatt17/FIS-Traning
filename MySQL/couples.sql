SELECT male.name, female.name
FROM user male join user female join rel
WHERE male.iduser = rel.user1 and female.iduser = rel.user2;