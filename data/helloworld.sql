create database helloworld;

use helloworld;

create table empresa(
id_empresa int primary key auto_increment,
nombre varchar(100),
descripcion varchar(400),
paginaweb varchar(400),
imagen varchar(200)
);

create table categoria(
id_categoria int primary key auto_increment,
nombre varchar(100),
imagen varchar(200)
);


create table producto(
id_producto int primary key auto_increment,
nombre varchar(100),
precio decimal(8,2),
paginacompra varchar(400),
paginaweb varchar(400),
imagen varchar(200),
id_categoria int,
id_empresa int,
CONSTRAINT fk_id_categoria FOREIGN KEY (id_categoria)
    REFERENCES categoria(id_categoria),
CONSTRAINT fk_id_empresa FOREIGN KEY (id_empresa)
    REFERENCES empresa(id_empresa)
);

select * from empresa;

select * from categoria;

select * from producto;

INSERT INTO `helloworld`.`empresa` (`id_empresa`, `nombre`, `descripcion`, `paginaweb`, `imagen`) VALUES ('1', 'Microsoft', 'Empresa fundada por bill Gates', 'https://www.microsoft.com/es-pe/', 'microsoft.png');
INSERT INTO `helloworld`.`empresa` (`id_empresa`, `nombre`, `descripcion`, `paginaweb`, `imagen`) VALUES ('2', 'Nvidia', 'Empresa tecnologica', 'https://www.nvidia.com/es-la/', 'nvidia.png');
INSERT INTO `helloworld`.`empresa` (`id_empresa`, `nombre`, `descripcion`, `paginaweb`, `imagen`) VALUES ('3', 'Logitechg', 'Empresa tecnologica', 'https://www.logitechg.com/es-es', 'logitechg.png');


INSERT INTO `helloworld`.`categoria` (`id_categoria`, `nombre`, `imagen`) VALUES ('1', 'Mouse', 'images/categorias/mouse.png');
INSERT INTO `helloworld`.`categoria` (`id_categoria`, `nombre`, `imagen`) VALUES ('2', 'Tarjeta Grafica', 'images/categorias/tarjetag.png');


INSERT INTO `helloworld`.`producto` (`id_producto`, `nombre`, `precio`,`paginacompra`, `paginaweb`, `imagen`, `id_categoria`, `id_empresa`) VALUES ('1', 'RTX 2070 SUPER', '3500','https://mpago.la/14NGSmZ','https://www.nvidia.com/es-la/geforce/graphics-cards/rtx-2070-super/', 'images/productos/rtx2070super.png', '2', '2');

INSERT INTO `helloworld`.`producto` (`id_producto`, `nombre`, `precio`,`paginacompra`, `paginaweb`, `imagen`, `id_categoria`, `id_empresa`) VALUES ('2', 'G203 PRODIGY', '90','https://mpago.la/2LKHrQg','https://www.logitechg.com/es-roam/products/gaming-mice/g203-prodigy-gaming-mouse.html', 'images/productos/g203p.png', '1', '2');


select p.id_producto,p.nombre,p.descripcion,p.precio,p.paginaweb,p.imagen,c.nombre as categoria,e.nombre as empresa from Producto p inner join Categoria c on(c.id_categoria=p.id_categoria) inner join Empresa e on(e.id_empresa=p.id_empresa);

