--insert Category
insert into Category (description, active) values ('Camisetas', 'A');
insert into Category (description, active) values ('Vasos', 'A');
insert into Category (description, active) values ('Comics', 'A');
insert into Category (description, active) values ('Juguetes', 'A');
insert into Category (description, active) values ('Accesorios', 'A');

--Users
insert into User (email,password,name,phone,address,rol,token) values ('admin@admin.com','911c8eb3c230c3350564857be60ac4f4','ADMINISTRADOR','098667666','QUITO','ADMIN','');
insert into User (email,password,name,phone,address,rol,token) values ('client1@correo.com','911c8eb3c230c3350564857be60ac4f4','Usuario X','098667666','QUITO','CUSTOMER','');
--insert Product

insert into Product (category_id, heroe, name, description, stock, min_stock, image, price, active) values (1, 'Ironman','Camiseta Ironman estampado','Camiseta elaborada en Microfibra  anticalor, blanco. Estampado Sublimada. talla S-M' , 10, 3, 'camiseta.jpg',20, 'A');

insert into Product (category_id, heroe, name, description, stock, min_stock, image, price, active) values (1, 'Spiderman','Camiseta Spiderman estampado','Camiseta elaborada en Microfibra  anticalor, blanco. Estampado Sublimada. talla S-M' , 3, 3, 'camiseta2.jpg',20, 'A');

insert into Product (category_id, heroe, name, description, stock, min_stock, image, price, active) values (1, 'Ironman','Camiseta Ironman estampado','Camiseta elaborada en Microfibra  anticalor, blanco. Estampado Sublimada. talla S-M' , 2, 4, 'camiseta.jpg',20, 'A');

insert into Product (category_id, heroe, name, description, stock, min_stock, image, price, active) values (1, 'Hulk','Camiseta Hulk estampado','Camiseta elaborada en Microfibra  anticalor, blanco. Estampado Sublimada. talla S-M' , 0, 2, 'camiseta2.jpg',20, 'A');

insert into Product (category_id, heroe, name, description, stock, min_stock, image, price, active) values (1, 'Spiderman','Camiseta Spiderman peq.','Camiseta elaborada en Microfibra  anticalor, blanco. Estampado Sublimada. talla S-M' , 3, 1, 'camiseta.jpg',20, 'A');

insert into Product (category_id, heroe, name, description, stock, min_stock, image, price, active) values (2, 'Ironman','Tasa sublimada regalo','Camiseta elaborada en Microfibra  anticalor, blanco. Estampado Sublimada. talla S-M' , 3, 1, 'camiseta2.jpg',20, 'A');

insert into Product (category_id, heroe, name, description, stock, min_stock, image, price, active) values (2, 'Hulk','Tasa sublimada regalo','Tasa porcelana' , 3, 1, 'camiseta2.jpg',20, 'A');

insert into Product (category_id, heroe, name, description, stock, min_stock, image, price, active) values (3, 'Ironman','Comic Ironman','Comic Ironman 30 hojas' , 3, 1, 'camiseta2.jpg',20, 'A');


