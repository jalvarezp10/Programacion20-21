
SubProceso resultado_es_multiplo <- EsMultiplo ( n1,n2)
	Si n1 mod n2 ==0 Entonces
		resultado_es_multiplo <- Verdadero
		
	SiNo 
		resultado_es_multiplo<- Falso
		
		
	Fin Si
	
Fin SubProceso

Proceso multiplo
	Escribir "Introduzca dos numero para ver si uno es multiplo de otro"
	Leer numero1,numero2
	Si EsMultiplo(numero1,numero2) Entonces
		Escribir "Es multiplo"
	SiNo
		Escribir "No es multiplo"
	Fin Si
	
	
FinProceso
