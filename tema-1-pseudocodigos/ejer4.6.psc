Proceso sumainfinita
Repetir
	Escribir "Dime tu codigo"
	Definir codigo como entero
	
	Leer codigo;
	Si codigo <> 1 Entonces
		Escribir "Codigo incorrecta"
		Leer codigo
	FinSi
Hasta Que codigo=1
Escribir "Correcto hora introduce la contraseña"
Repetir
	Definir clave Como Entero
	Escribir "Dime tu clave de acceso"
	Leer clave;
	Si clave <> 1234 Entonces
		Escribir "Clave incorrecta"
		Leer clave
	FinSi
Hasta Que clave=1234
Escribir "Bienvenido!"

	
	

FinProceso
