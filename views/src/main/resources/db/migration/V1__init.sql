CREATE TABLE client (
    id SERIAL PRIMARY KEY,
    fullname VARCHAR(100) NOT NULL,
    address VARCHAR(155) NOT NULL
);

CREATE TABLE product (
    id SERIAL PRIMARY KEY,
    description VARCHAR(200) NOT NULL,
    brand VARCHAR(100) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    stock INT NOT NULL
);

CREATE TABLE invoice (
    id SERIAL PRIMARY KEY,
    code VARCHAR(30) UNIQUE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10,2) NOT NULL,
    client_id INT,
    FOREIGN KEY (client_id) REFERENCES client(id)
);

CREATE TABLE detail (
    id SERIAL PRIMARY KEY,
    quantity INT NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    invoice_id INT,
    product_id INT,
    FOREIGN KEY (invoice_id) REFERENCES invoice(id),
    FOREIGN KEY (product_id) REFERENCES product(id)
);



