Proceso sin_titulo
	Escribir "Introduce un numero impar mayor o igual que 5"
	Definir altura Como Entero
	Leer altura
	
	Si altura%2<>0 y altura>=5 Entonces
		Para i<-1 Hasta altura Con Paso 1 Hacer
			Para j<-1 Hasta 6 Con Paso 1 Hacer
				Si i=1 Entonces
					Escribir Sin Saltar"M"
				Fin Si
				Si j=1 Entonces
					Escribir Sin Saltar"M"
				Fin Si
				Si i=trunc(altura/2+1) Entonces
					Escribir Sin Saltar"M"
				Fin Si
				Si i=altura Entonces
					Escribir Sin Saltar"M"
				Fin Si
				
				
				
				
			Fin Para
			Escribir ""
			
		Fin Para
	SiNo
		Escribir "Introduce un numero impar mayor 5"
	Fin Si
	
	
FinProceso