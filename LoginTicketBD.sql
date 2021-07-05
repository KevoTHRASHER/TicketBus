USE LoginTicket;
DROP DATABASE LoginTicket;
DESCRIBE LoginEmpleado;
SELECT * FROM LoginEmpleado;
INSERT INTO LoginEmpleado VALUES
(1,'gaby@gmail.com', 'gaby123'),
(2,'hugo@gmail.com', 'hugo123');

DESCRIBE Empleado;
SELECT * FROM LoginTicket.Empleado;
INSERT INTO Empleado VALUES
(3, 'Gabriela Ita-ii Mijangos Zamudio', 'gaby@gmail.com','gaby123', 20, 'Taquillero'),
(1, 'Gabriela Ita-ii Mijangos Zamudio', 'gaby@gmail.com','gaby123', 20, 'Taquillero'),
(2, 'Hugo Antonio Martinez Dominguez', 'hugo@gmail.com', 'hugo123', 20, 'Taquillero');
DELETE from LoginTicket.Empleado WHERE idEmpleado=3;

DESCRIBE Cliente;
SELECT * FROM LoginTicket.Cliente;
INSERT INTO Cliente VALUES
(1, 'Salma Hayek Jimenez', 33, '2281574698', 'salma@gmail.com'),
(2, 'Gael Garcia Bernal', 38, '9711231234', 'gael@gmail.com'),
(3, 'Damian Alcazar', 50, '9511231234', 'damian@gmail.com'),
(4, 'Maria Felix', 42, '5555566666', 'maria@hotmail.com'),
(5, 'Adriana Barraza', 42, '5552223333', 'adriana@hotmail.com'),
(6, 'Diego Luna', 36, '5554446666', 'diego@hotmail.com');
DELETE from LoginTicket.Cliente WHERE idCliente=3;

DESCRIBE Origen;
SELECT * FROM LoginTicket.Origen;
INSERT INTO Origen VALUES
(1, 'Salina Cruz', 'Oaxaca', 'A1'),
(2, 'Tehuantepec', 'Oaxaca', 'A2');

DESCRIBE Destino;
SELECT * FROM LoginTicket.Destino;
INSERT INTO Destino VALUES
(1, 'Salina Cruz', 'Oaxaca', 'A1'),
(2, 'Tehuantepec', 'Oaxaca', 'A2'),
(3, 'Juchitan', 'Oaxaca', 'A3'),
(4, 'Huatulco', 'Oaxaca', 'A4');

DESCRIBE Intinerario;
SELECT * FROM LoginTicket.Intinerario;
INSERT INTO Intinerario VALUES
(1, '20:00:00', 20210702, 1, 2),
(2, '20:30:00', 20210702, 1, 3),
(3, '21:00:00', 20210702, 1, 4),
(4, '20:00:00', 20210702, 2, 1),
(5, '20:30:00', 20210702, 2, 3),
(6, '21:00:00', 20210702, 2, 4);

DESCRIBE Viaje;
SELECT * FROM LoginTicket.Viaje;
INSERT INTO Viaje VALUES
(1, 45, 'Volvo', 1231, 'Miguel de Icaza', 1),
(2, 40, 'Volvo', 1232, 'Linus Benedict Torvalds', 2),
(3, 30, 'Mercedes Benz', 1233, 'Dennis MacAlistair Ritchie', 3),
(4, 45, 'Volvo', '1234', 'Michael Jeffrey Jordan', 4),
(5, 40, 'Volvo', 1235, 'Quentin Tarantino', 5),
(6, 30, 'Mercedes Benz', 1236, 'Akira Kurosawa', 6);

DESCRIBE Boleto;
SELECT * FROM LoginTicket.Boleto;
INSERT INTO Boleto VALUES 
(1, 'Salma Hayek Jimenez', 'Salina Cruz', 'Huatulco', 2, '21:00:00', 20210702, 'VIP', 2999),
(2, 'Gael Garcia Bernal', 'Salina Cruz', 'Juchitan', 25, '20:30:00', 20210702, 'Ejecutivo', 1299),
(3, 'Damian Alcazar', 'Salina Cruz', 'Tehuantepec', 17, '20:00:00', 20210702, 'Economico', 499),
(4, 'Maria Felix', 'Tehuantepec', 'Huatulco', 1, '21:00:00', 20210702, 'VIP', 3499),
(5, 'Adriana Barraza', 'Tehuantepec', 'Juchitan', 13, '20:30:00', 20210702, 'Ejecutivo', 999),
(6, 'Diego Luna', 'Tehuantepec', 'Salina Cruz', 31, '20:00:00', 20210702, 'Economico', 399);
DELETE FROM Boleto WHERE idBoleto = 6;