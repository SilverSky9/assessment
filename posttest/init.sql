CREATE TABLE lottery
(
    id SERIAL,
    number varchar(255),
    user_id int2,
    price int2,
    amount int2
);
INSERT INTO public.lottery (id, number, user_id, price, amount) VALUES (1, 'ticket_9gmid', null, 1, 1);
INSERT INTO public.lottery (id, number, user_id, price, amount) VALUES (2, 'ticket_6tsou', null, 1, 1);
