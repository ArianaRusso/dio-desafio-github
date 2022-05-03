
public class Aluno {
	
	private String nome;
	private int CPF;
	private String email;
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome= nome;
	}
	
	public int getCPF () {
		return CPF;
	}
	
	public void setCPF (int CPF) {
		this.CPF= CPF;
	}
	
	public String getEmail () {
		return email;
	}
	
	public void setEmail (String email) {
		this.email= email;
	}
	
	private boolean Validar_CPF (int cpf) {
		return true; 
	}

}
