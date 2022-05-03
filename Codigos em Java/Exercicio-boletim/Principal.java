import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome ("Ariana");
		aluno1.setCPF(313);
		aluno1.setEmail("arianarusso@hotmail.com");
		
		//aluno1.Validar_CPF(313);
		
		System.out.println("O nome inserido foi: "+ aluno1.getNome());
		System.out.println(" O CPF inserido foi: "+ aluno1.getCPF());
		System.out.println("O email inserido foi: "+ aluno1.getEmail());
		
		//System.out.println("Valindo CPF: "+ aluno1.Validar_CPF());
		
		Boletim alunoGrad = new Boletim();
		Boletim alunoPos = new Boletim();
		
		System.out.println (" A media do aluno de graduação é: " + alunoGrad.calcularMedia(5, 5.6, 8.2));
		System.out.println (" A media do aluno de pos-graduação é: " + alunoPos.calcularMedia(4.8, 10));
		
		
		float nota;
		int freq;
		String st;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Insira a nota inicial");
		nota=teclado.nextFloat();
		
		System.out.println("Insira a frequencia inicial");
		freq= teclado.nextInt();
		
		System.out.println("Insira a status inicial");
		st= teclado.next();
		
		Boletim b1= new Boletim (nota, freq, st);
		Boletim b2= new Boletim();
		Boletim b3= new Boletim("Aprovado");
		
		System.out.println("Tres parametros: ");
		b1.imprimir();
		
		System.out.println("Nenhum parametros: ");
		b2.imprimir();
		
		System.out.println("Um parametros: ");
		b3.imprimir();
		
	}

}
