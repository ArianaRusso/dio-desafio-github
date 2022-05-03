package exercicio_heranca;

public class Retangulo implements Forma2d{
	
	private int base;
	private int altura;
	
	//construtor
	public Retangulo(int base, int altura) {
		this.base= base;
		this.altura= altura;
	}
	
	//metodo get/set
	public int getBase() {
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
		return this.base * this.altura;
	}
	
	@Override
	public String toString() {
		return String.format("%s\n Area do Retangulo: %d\n", this.calcularArea());
		
	}

}
