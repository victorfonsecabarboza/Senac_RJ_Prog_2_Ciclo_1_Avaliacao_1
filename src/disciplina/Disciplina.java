package disciplina;

import java.util.ArrayList;
import java.util.List;
import professor.Professor;

public class Disciplina {

	private String nome;
	private int idDisciplina;
	private String descricao;
	public Professor professor;

	List<aluno.AlunoGraduacao> alunos = new ArrayList<aluno.AlunoGraduacao>();
	List<aluno.AlunoPosGraduacao> alunosPos = new ArrayList<aluno.AlunoPosGraduacao>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
