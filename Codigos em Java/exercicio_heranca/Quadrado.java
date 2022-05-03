package exercicio_heranca;

public class Quadrado implements Forma2d {
	
	private int largura;
	
	//construtor
	public Quadrado(int largura) {
		this.largura= largura;	
	}
	
	//metodo get/set
	public int getLargura() {
		return this.largura;
	}
	
	public void setLargura(int largura) {
		this.largura= largura;
	}
	
	public int calcularArea() {
		return this.largura * this.largura;
	}
	
	@Override
	public String toString() {
		return String.format("%s\n Area do Quadrado: %d\n", this.calcularArea());
		
	}
}
