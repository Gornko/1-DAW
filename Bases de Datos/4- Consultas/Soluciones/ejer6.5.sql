use northwind;
select * from categories;
select * from shippers;
select * from suppliers;
select * from orders;
select * from orderdetails;
select * from customers;
select * from products;
select * from employees;

-- 1)
select orders.* from orders, customers where orders.CustomerID=customers.CustomerID and ContactName like "Ana Trujillo";

select * from orders o
inner join customers c on o.CustomerID = c.CustomerID
where c.ContactName like "Ana Trujillo";

-- 2)
select orderdetails.* from orderdetails, orders, customers where orderdetails.OrderID=orders.OrderID and orders.CustomerID=customers.CustomerID and CompanyName like "Ana Trujillo Emparedados y helados" and OrderDate like "1996-09-18%";

select od.*, c.* from orders o
inner join customers c on o.CustomerID = c.CustomerID
inner join orderdetails od on o.OrderID = od.OrderID
where c.ContactName like "Ana Trujillo" and o.OrderDate like "1996-09-18%";

-- 3)
select orderdetails.*, UnitPrice*0.85 as ConDescuento from orderdetails, orders, customers where orderdetails.OrderID=orders.OrderID and orders.CustomerID=customers.CustomerID and CompanyName like "Ana Trujillo Emparedados y helados" and OrderDate like "1996-09-18%";

select  od.UnitPrice * 0.85  as ConDescuento, od.*,  c.* from orders o
inner join customers c on o.CustomerID = c.CustomerID
inner join orderdetails od on o.OrderID = od.OrderID
where c.ContactName like "Ana Trujillo" and o.OrderDate like "1996-09-18%" and ProductID = 69;

-- 4) 
select o.OrderID as NúmeroOrden, 
p.ProductName as NombreProducto,
 p.UnitPrice as PreciUnitarioProducto,
 od.UnitPrice as PreciUnitarioOrden,
 od.Quantity, 
 "15" as discount,
 (p.UnitPrice * od.Quantity ) as PrecioLinea, 
  (p.UnitPrice * od.Quantity ) * 0.85 as PrecioLineaDescu
 from orders o
inner join customers c on o.CustomerID = c.CustomerID
inner join orderdetails od on o.OrderID = od.OrderID
inner join products p on od.ProductID = p.ProductID
where c.ContactName like "Ana Trujillo" and o.OrderDate like "1996-09-18%";

-- 5)
select o.OrderID,
c.ContactName as NombreCliente, 
e.FirstName as NombreEmpleado,
 e.LastName as ApellidoEmpleado,
 DATE_FORMAT(o.OrderDate, '%d-%m-%Y') as FechaPedido,
DATE_FORMAT(o.ShippedDate, '%d-%m-%Y') as FechaEnvio,
c.Address, c.City, c.Region, c.PostalCode, c.Country, c.Phone,
SUM(p.UnitPrice * od.QUantity) as PrecioCabecera
 from orders o
inner join customers c on o.CustomerID = c.CustomerID
inner join orderdetails od on o.OrderID = od.OrderID
inner join products p on od.ProductID = p.ProductID
inner join employees e on o.EmployeeID = e.EmployeeID
where c.ContactName like "Ana Trujillo" and o.OrderDate like "1996-09-18%"
group by o.OrderID, e.FirstName,  e.LastName,
o.OrderDate, o.ShippedDate, c.Address,  c.City, c.Region,  c.PostalCode,  c.Country,  c.Phone;

-- 6)
select count(OrderID) from orders,shippers where orders.ShipVia= shippers.ShipperID and shippers.CompanyName like "United Package" and orders.OrderDate like "1997%";

select count(o.OrderID)
 from orders o
inner join shippers s on o.ShipVia = s.ShipperID
where s.CompanyName like "United Package" and o.OrderDate like "1997%";

-- 7)
with totalpedidos as
(select OrderID, sum(UnitPrice*Quantity) as TotalPrice from orderdetails group by OrderID)
select  avg(TotalPrice) as ImporteMedioPedido from totalpedidos, orders where totalpedidos.OrderID=orders.OrderID and OrderDate like "1996%";

-- 8)
with totalpedidos as
(select OrderID, sum(UnitPrice*Quantity) as TotalPrice from orderdetails group by OrderID)
select DISTINCT year(OrderDate) as año, avg(TotalPrice) as ImporteMedioAño from totalpedidos, orders where totalpedidos.OrderID=orders.OrderID group by year(OrderDate);

-- 9)
select s.SupplierID, s.CompanyName, SUM(od.UnitPrice * od.Quantity) as SumaImportesProveedor from orderdetails od 
inner join products p on od.ProductID = p.ProductID
inner join suppliers s on s.SupplierID = p.SupplierID 
group by s.SupplierID, s.CompanyName
having SUM(od.UnitPrice * od.Quantity) > 1000
order by  s.CompanyName asc;

-- 10)
select o.EmployeeID, e.FirstName, e.LastName, SUM(od.UnitPrice * od.Quantity) as totaldeVentas, e.salary, (SUM(od.UnitPrice * od.Quantity)/100) as comision,  e.salary + (SUM(od.UnitPrice * od.Quantity)/100) as salario from orders o
inner join employees e on o.EmployeeID = e.EmployeeID 
inner join orderdetails od on o.OrderID = od.OrderID
where o.OrderDate like "1997%"
group by o.EmployeeID
having SUM(od.UnitPrice * od.Quantity) > 1000
order by salario desc;







