BEGIN TRANSACTION;

-- Drop the tables and sequences if they already exist
DROP TABLE IF EXISTS customer, book, orders, order_items, admin;

-- Create the customer table
CREATE TABLE customer(
    customer_id serial NOT NULL,
    name varchar(50) NOT NULL,
    email varchar(50) UNIQUE NOT NULL,
    password varchar(50) NOT NULL,
    address varchar(50) NOT NULL,
    balance NUMERIC(10, 2),
    role varchar(50) NOT NULL,
    CONSTRAINT PK_customer PRIMARY KEY(customer_id)
);

-- Create the book table
CREATE TABLE book(
    book_id serial not null,
    title varchar(50) not null,
    author varchar(50) not null,
    genre varchar(50) not null,
    price NUMERIC(13, 2) not null,
    quantity_in_stock int not null,
    CONSTRAINT PK_book PRIMARY KEY(book_id)
);

-- Create the orders table
CREATE TABLE orders(
    order_id serial NOT NULL,
    customer_id serial NOT NULL,
    order_date DATE NOT NULL,
    total_cost NUMERIC(10, 2) NOT NULL,
    CONSTRAINT PK_orders PRIMARY KEY(order_id),
    CONSTRAINT FK_orders_customer FOREIGN KEY (customer_id) REFERENCES customer (customer_id)
);


CREATE TABLE order_items(
    order_item_id serial NOT NULL,
    quantity int NOT NULL,
    subtotal NUMERIC(10, 2),
    order_id serial NOT NULL,
    book_id serial NOT NULL,
    CONSTRAINT PK_order_items PRIMARY KEY(order_item_id),
    CONSTRAINT FK_order_items_orders FOREIGN KEY(order_id) REFERENCES orders (order_id),
    CONSTRAINT FK_order_items_book FOREIGN KEY(book_id) REFERENCES book (book_id)
);


CREATE TABLE admin(
    admin_id serial NOT NULL,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL,
    email varchar(50) UNIQUE NOT NULL,
    password varchar(50) NOT NULL,
    role varchar(50) NOT NULL,
    CONSTRAINT PK_admin PRIMARY KEY(admin_id)
);

-- Insert data into the admin table
INSERT INTO admin(first_name, last_name, email, password, role) VALUES('Abdale', 'Hassan', 'Abdale@gmail.com', 'password', 'MANAGER');
INSERT INTO admin(first_name, last_name, email, password, role) VALUES('Hamda', 'Jama', 'hamda@gmail.com', 'password', 'MANAGER');

COMMIT;
