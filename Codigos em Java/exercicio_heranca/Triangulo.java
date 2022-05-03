package exercicio_heranca;

public class Triangulo implements Forma2d {
	
	private int base;
	private int altura;
	
	//construtor
	public Triangulo(int base, int altura) {
		this.base= base;
		this.altura= altura;
	}
	
	//metodo get/set
	public int getBasea() {
		return this.base;
	}
	
	public void setBase(int base) {
		this.base= base;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public void setAltura(int altura) {
		this.altura=altura;
	}
	
	public int calcularArea() {
		return (this.base * this.altura) /2;
	}
	
	@Override
	public String toString() {
		return String.format("%s\n Area do Triangulo: %d\n", this.calcularArea());
		
	}

}
