package ordenação_simples;

public class Trabalhador {
	
	String nome;
	double salario;
	int id;
	
	//construtor
	public Trabalhador(String nome, double salario, int id) {
		this.nome=nome;
		this.salario= salario;
		this.id=id;
	}
	
		
	@Override
	public String toString() {
		return "Trabalhador{" + "nome="+ nome + ",salario="+ salario + ",id="+ id +"}";
	}
	
}
