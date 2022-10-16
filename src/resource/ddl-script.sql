create table tb_address
(
    id     int auto_increment
        primary key,
    street varchar(100) null,
    city   varchar(100) null,
    state  varchar(100) null,
    zip    varchar(100) null
);

create table tb_author
(
    id          int auto_increment
        primary key,
    firstname   varchar(100) null,
    lastname    varchar(100) null,
    phonenumber varchar(45)  null,
    address_id  int          null
);

create table tb_author_book
(
    id        int auto_increment
        primary key,
    author_id int null,
    book_id   int null
);

create table tb_book
(
    id                  int auto_increment
        primary key,
    isbn                varchar(45)  not null,
    title               varchar(100) null,
    number_of_copy      int          null,
    max_checkout_length int          null,
    constraint isbn_UNIQUE
        unique (isbn)
);

create table tb_book_copy
(
    id          int auto_increment
        primary key,
    book_id     int         not null,
    copy_number varchar(45) not null,
    status      varchar(45) null,
    constraint copy_number_UNIQUE
        unique (copy_number)
);

create table tb_checkout
(
    id                int auto_increment
        primary key,
    checkout_entry_id int null,
    library_member_id int null
);

create table tb_checkout_entry
(
    id            int auto_increment
        primary key,
    checkout_date varchar(45) null,
    due_date      varchar(45) null,
    book_copy_id  varchar(45) null
);

CREATE TABLE `tb_library_member` (
                                     `id` int NOT NULL AUTO_INCREMENT,
                                     `firstname` varchar(100) DEFAULT NULL,
                                     `lastname` varchar(100) DEFAULT NULL,
                                     `phonenumber` varchar(45) DEFAULT NULL,
                                     `address_id` int DEFAULT NULL,
                                     PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3

create table tb_user
(
    username varchar(45) not null,
    password varchar(45) null,
    auth     varchar(45) null,
    id       int auto_increment
        primary key,
    constraint username_UNIQUE
        unique (username)
);

