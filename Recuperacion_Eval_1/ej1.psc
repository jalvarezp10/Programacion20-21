Proceso sin_titulo
	Escribir "Introduzca un numero"
	Leer num Entero
	Leer media
	Leer impares
	Leer contador
	
	impares=0
	contador=0
	media =num/impares
	
	Mientras num<0 Hacer
		contador=contador+1
		Si num%2=!0 Entonces
			impares=impares+1
			num=num+num
		Fin Si
		
		
		
		
	Fin Mientras
	Escribir contador
	Escribir media
FinProceso
