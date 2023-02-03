CREATE TABLE products (
   id  serial PRIMARY KEY,
   name VARCHAR NOT NULL,
   description VARCHAR NOT NULL,
   created_on TIMESTAMP default current_timestamp
);

INSERT INTO products(name, description) VALUES ('azus A 15', 'gaming laptop');