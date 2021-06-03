SELECT * FROM LoginTicket.Usuarios;

INSERT INTO Usuarios (
	Usuario, 
	Contraseña
)
VALUES 
	('hugo@outlook.com', 'hugo123'),
    ('gaby@gmail.com', 'gaby123'),
    ('carmen@itsal.com', 'carmen123'),
    ('miguel@hotmail.com', 'miguel123');

SELECT * FROM LoginTicket.Usuarios WHERE Usuario='gaby@gmail.com' and Contraseña='gaby123';

DELETE from LoginTicket.Usuarios WHERE idUsuarios=9