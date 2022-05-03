//exercicios proposto: verificar se dois pontos são iguais e calcular a distancia entre eles. 

public class Ponto {
	
	private int x;
	private int y;
	
	
	public Ponto (int x,int y) {
		this.x= x;
		this.y= y;
	}
	
	public Ponto() {
		this(0,0);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX (int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY (int y) {
		this.y = y;
	}
	
	@Override
	public boolean equals(Object outro) {
		if (outro instanceof Ponto && (this.x == ((Ponto) outro).x) && (this.y == ((Ponto) outro).y)) {
			return true;
		}
		return false;	
	}
	
	public int distanciaPontos (Ponto outro) {
		int dX= this.x- outro.x;
		int dY= this.y-outro.y;
		int distancia= (int) Math.sqrt(Math.pow(dX, 2)+ Math.pow(dY,2));
		return distancia;
		
	}

}
