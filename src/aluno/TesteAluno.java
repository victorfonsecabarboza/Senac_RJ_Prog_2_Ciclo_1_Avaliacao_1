package aluno;

public class TesteAluno {
	public static void main(String[] args) {

		AlunoGraduacao aluno1 = new AlunoGraduacao();

		aluno1.setNome("Victor Fonseca");
		aluno1.setCpf(1234567890);
		aluno1.setMatricula(1990);
		aluno1.setEndereco("Rua tal");
		aluno1.setTelefone(123456789);
		aluno1.setEmail("algumnome@gmail.com");

		System.out.println("Informações do aluno cadastrado abaixo:\n");
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Cpf: " + aluno1.getCpf());
		System.out.println("Matrícula: " + aluno1.getMatricula());
		System.out.println("Endereço: " + aluno1.getEndereco());
		System.out.println("Telefone: " + aluno1.getTelefone());
		System.out.println("E-mail: " + aluno1.getEmail());

	}

}
