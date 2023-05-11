package avaliacao;

import aluno.AlunoGraduacao;
import aluno.AlunoPosGraduacao;

public class Avaliacao {

	private double nota1;
	private double nota2;
	private double media;

	public AlunoGraduacao aluno;
	public AlunoPosGraduacao alunoPos;
	public disciplina.Disciplina discplina;

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

}
