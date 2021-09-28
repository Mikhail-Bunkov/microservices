create table products
(
    id          bigserial primary key,
    title       varchar(255),
    price       numeric(8, 2) not null,
    created_at  timestamp default current_timestamp,
    updated_at  timestamp default current_timestamp
);

insert into products (title, price)
values ('Milk', 95),
       ('Bread', 28),
       ('Cheese', 420),
       ('Water', 20),
       ('Potato', 25),
       ('Orange', 40),
       ('Strawberry', 35),
       ('Blueberry', 42),
       ('Cherry', 42),
       ('Apple', 37);
