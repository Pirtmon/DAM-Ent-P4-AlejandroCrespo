package main.java.liceosorolla;

public class Numero {

	private int numero1;
	private int numero2;

	public Numero(int numero1, int numero2) {

		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public String toString() {
		return "numero1=" + numero1 + " numero2=" + numero2;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int suma() {
		int suma = 0;

		suma = this.numero1 + this.numero2;

		return suma;

	}

	public int resta() {
		int resta = 0;

		resta = this.numero2 - this.numero1;

		return resta;

	}

	public int multiplicacion() {
		int multiplicacion = 0;

		multiplicacion = this.numero1 * this.numero2;

		return multiplicacion;

	}

	public int division() {
		int division = 0;

		division = this.numero2 / this.numero1;

		return division;

	}

	public int potencia() {

		int potencia = 0;

		potencia = (int) Math.pow(this.numero2, this.numero1);

		return potencia;

	}

	public boolean multiplo() {
		boolean multi = false;

		if (this.numero1 >= this.numero2) {
			if (this.numero1 % this.numero2 == 0) {

				multi = true;
			}

		} else {

			if (this.numero2 % this.numero1 == 0) {

				multi = true;
			}

		}

		return multi;

	}

}
