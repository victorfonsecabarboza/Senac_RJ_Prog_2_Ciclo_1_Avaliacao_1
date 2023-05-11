package professor;

import avaliacao.Avaliacao;
import disciplina.Disciplina;

public class Professor extends pessoa.Pessoa {

	private Disciplina disciplina;
	private Avaliacao avaliacao;

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public void lancarNotas(int notas) {

	}

	public void lancarFrequencia(int presenca) {

	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}
