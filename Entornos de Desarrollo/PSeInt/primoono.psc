Funcion Primo(x)
	Definir divisores, i Como Entero;
	divisores=0;
	i=1;
	Para i<-1 Hasta x Con Paso 1 Hacer
		Si x%i=0 Entonces
			divisores=divisores+1;
		FinSi
	FinPara
	Si divisores=2 Entonces
		Escribir "El numero ",x," es primo";
	SiNo
		Escribir "El numero ",x," no es primo";
	FinSi
FinFuncion

Algoritmo primono
	Definir i,ultimo Como Entero;
	i=0;
	ultimo=0;
	Escribir "¿Que numero quieres analizar?";
	Leer ultimo;
	Para i<-1 Hasta ultimo Con Paso 1 Hacer
		Primo(i);
	FinPara
FinAlgoritmo
	