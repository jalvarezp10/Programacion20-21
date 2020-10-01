SubProceso EscribirCentrado  ( texto )
	definir a Como Entero
	definir numero_espacios Como Real
	numero_espacios<-redon (40-Longitud(texto)/2)
	Para numero_espacios<-0 Hasta numero_espacios Con Paso 1 Hacer
		Escribir Sin Saltar " "
	Fin Para
	
Fin SubProceso
Proceso Ejer1
	EscribirCentrado("textocentrado")
	Escribir "texto centrado"

	
FinProceso
