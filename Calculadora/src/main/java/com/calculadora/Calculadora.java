package com.calculadora;
/**
 * 
 * @author Eduardo Caro Lorente
 * @version 1.0
 */
public class Calculadora {
	private float lastResult;
	private String lastOp;
	/**
         * Método para obtener el resultado de la última operación
         * @return el resultado de la última operación
         */
	public float getLastResult() {
		return this.lastResult;
	}
	/**
         * Método para saber cuál ha sido la última operación realizada
         * @return cadena con la última operación realizada
         */
	public String getLastOp() {
		return this.lastOp;
	}
        /**
         * Método para sumar dos valores
         * @param op1 es el primero de los valores
         * @param op2 es el segundo de los valores
         * @return la suma de los valores pasados como parámetros
         */
	
	public float suma( float op1, float op2) {
		float result = op1 + op2;
		this.lastResult = result;
		this.lastOp = "Suma";
		return result;
	}
        /**
         * Método para restar dos valores
         * @param op1 es el minuendo
         * @param op2 es el sustraendo
         * @return la resta del minuendo menos el sustraendo
         */
	
	public float resta(float op1, float op2) {
		float result = op1 - op2;
		this.lastResult = result;
		this.lastOp = "Resta";
		return result;
	}
	/**
         * Método para multiplicar dos valores
         * @param op1 es el primero de los valores
         * @param op2 es el segundo de los valores
         * @return el producto entre los dos valores pasados como parámetros
         */
	public float multiplica(float op1, float op2) {
		float result = op1 * op2;
		this.lastResult = result;
		this.lastOp = "Multiplica";
		return result;
	}
	/**
         * Método para dividir dos valores
         * @param op1 es el dividendo
         * @param op2 es el divisor
         * @return el cociente de la división entre el dividendo y el divisor
         */
	public float divideix(float op1, float op2) {
		float result = op1 / op2;
		this.lastResult = result;
		this.lastOp = "Divideix";
		return result;
	}
	/**
         * Método que sirve para comprobar si un valor es mayor a otro
         * @param op1 el valor del cuál se quiere comprobar que sea mayor
         * @param op2 el valor contra el que se compara si un número es mayor o no
         * @return si (true) en caso de que se cumpla que op1 sea mayor a op2, o no (false) en caso contrario
         */
	public boolean majorQue (float op1, float op2) {
		if (op1 > op2) {
			return true;
		}
		return false;
	}
        /**
         * Método para reiniciar las variables de último resultado y última operación
         */
	public void restablecer(){
		this.lastResult = 0;
		this.lastOp = "Ninguna";
	}
}



