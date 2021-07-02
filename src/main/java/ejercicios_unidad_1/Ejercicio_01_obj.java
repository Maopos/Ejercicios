package ejercicios_unidad_1;



//Elaborado por Mauricio Posada

/* 1. Realizar la suma, la resta, la división y la multiplicación de dos números leídos por teclado y mostrar 
* en pantalla “La <operación> de <número 1> y <número 2> es igual a <resultado> ”. */


public class Ejercicio_01_obj {

	public static void main(String[] args) {
		
		Operaciones ejercicio_01 = new Operaciones();

		ejercicio_01.num_1 = 2;
		
		
	}

}

class Operaciones {

	int num_1;
	int num_2;

	public void setNum_1(int num_1) {
		this.num_1 = num_1;
	}

	public void setNum_2(int num_2) {
		this.num_2 = num_2;
	}

	public int getSuma(){
		return num_1 + num_2;
	}

}

