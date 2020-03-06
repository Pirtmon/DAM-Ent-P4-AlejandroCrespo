package main.java.liceosorolla;

public class Rectangulo {
	
	private int lado1;
	private int lado2;
	
	public Rectangulo(int lado1, int lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public int getLado1() {
		return lado1;
	}
	
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	
	public int getLado2() {
		return lado2;
	}
	
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public boolean calcularLadosIguales() {
		
		boolean lados=true;
		
		if (lado1==lado2) {
			lados=true;
		}else {
			lados=false;
		}
		
		return lados;
		
	}
	
	public int calcularPerimetro() {
		
		int resultado;
		
		resultado = (this.lado1+this.lado2)*2;
		
		return resultado;
		
	}
	
	public int calcularArea() {
		
		int resultado;
		
		resultado = this.lado1*this.lado2;
		
		return resultado;
		
	}
	
	public int calcularDiagonal() {
		
		int resultado;
		
		resultado= (int) Math.sqrt((Math.pow(this.lado1, 2))+(Math.pow(this.lado2, 2)));
		
		return resultado;
	} 
	
	public int calcularCircunferencia() {
		
		int radio;
		int menor = this.lado1;
		
		if(this.lado2 < this.lado1) {
			menor=this.lado2;
		}
		return radio = menor/2;
			
	}
}
