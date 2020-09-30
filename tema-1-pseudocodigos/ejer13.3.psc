
SubProceso resultado_es_par <- EsPar ( numero )
	Si numero mod 2==0 Entonces
		resultado_es_par<-Verdadero
	SiNo
		resultado_es_par<- Falso
	Fin Si
	
Fin SubProceso

Proceso par
	Escribir "Introduzca un numero para ver si es par"
	Leer numero_usuario
	Si EsPar(numero_usuario) Entonces
		Escribir "Es par"
	SiNo
		Escribir "Es impar"
	Fin Si
	
	
FinProceso
