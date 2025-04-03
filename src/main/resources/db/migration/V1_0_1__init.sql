create table education_place (
                         id bigint primary key,
                         name varchar(255),
                         address varchar(100),
                         type varchar(100) not null
);

create table account (
                         id bigint primary key,
                         email varchar(255),
                         phone_number varchar(100),
                         first_name varchar(100) not null,
                         second_name varchar(100) not null,
                         last_name varchar(100),
                         date_of_birth date,
                         age int,
                         photoId varchar(100),
                         is_online boolean default false not null,
                         last_online_at timestamp(2) not null
);

create table education_period (
                         id bigint primary key,
                         date_from date,
                         date_to date,
                         account_id bigint references account(id),
                         education_place_id bigint references education_place(id)
);
