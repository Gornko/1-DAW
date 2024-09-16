Proceso TareaEntregaMejor
	Definir num,cuenta,cont,prod Como Entero;
	prod=1;
	Escribir "Del 1 al 10, ¿Hasta que tabla quieres imprimir?";
	Leer num;
	Mientras NO(num>0&num<11) Hacer
		Escribir "Entrada no valida";
		Leer num;
	FinMientras
	Escribir "Tablas de multiplicar del 1 al ",num;
	Para cuenta=1 Hasta num Con Paso 1 Hacer
		Para cont =1 Hasta 10 Con Paso 1  Hacer
			Escribir prod, " X ", cont, " = ", (prod * cont);
		FinPara
		prod=prod+1;
	FinPara
FinProceso
