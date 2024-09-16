Proceso calificacion
	Definir nota Como Entero;
	Escribir "introduzca la nota";
	Leer nota;
	Segun nota Hacer
		0,1,2: 
			Escribir "MD";
		3,4: 
			escribir	"INS";
		5,6: 
			escribir "BIEN";
		7,8: 
			escribir "NOT";
		9,10: 
			escribir "SOB";
		De Otro Modo:
			Escribir "Nota no valida"; 
	FinSegun
	
FinProceso
