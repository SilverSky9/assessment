CREATE TABLE lottery
(
    id SERIAL,
    number varchar(255),
    user_id int2,
    price int2,
    amount int2
);

CREATE TABLE user_ticket
(
    id SERIAL,
    user_id int2,
    lottery_id int2,
    number varchar(255),
    price int2
);