package exercicio_heranca;

public class Circulo implements Forma2d{
	
private int raio;
	
	//construtor
	public Circulo (int raio) {
		this.raio= raio;	
	}
	
	//metodo get/set
	public int getRaio() {
		return this.raio;
	}
	
	public void setRaio(int raio) {
		this.raio= raio;
	}
	
	public int calcularArea() {
		return (int) ((this.raio * this.raio) * 3.14);
	}
	
	@Override
	public String toString() {
		return String.format("%s\n Area do Circulo: %d\n", this.calcularArea());
		
	}
	
	

}
