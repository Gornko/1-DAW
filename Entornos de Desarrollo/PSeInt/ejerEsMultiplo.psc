Proceso ejerEsMultiplo
	Definir a,b Como Entero;
	Escribir "introduzca un numero";
	Leer a;
	Escribir "introduzca segundo numero";
	leer b;
	multiplo(a,b);
FinProceso

SubProceso multiplo(numero1,numero2)
	
	si numero1>numero2 Entonces
		si numero1%numero2=0 Entonces
			Escribir numero1," es multiplo de ",numero2;
		SiNo
			Escribir "ninguno es multiplo de otro";
		FinSi
	SiNo
		si numero2%numero1=0 Entonces
			Escribir numero2," es multiplo de ",numero1;
		SiNo
			Escribir "ninguno es multiplo de otro";
			
		FinSi
	
		
	FinSi
FinSubProceso
	