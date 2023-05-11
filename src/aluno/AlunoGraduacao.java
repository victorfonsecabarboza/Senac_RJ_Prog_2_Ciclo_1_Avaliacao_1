package aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoGraduacao extends pessoa.Pessoa implements SolicitacoesAluno {
	
	private int semestre;

	List<disciplina.Disciplina> disciplina = new ArrayList<disciplina.Disciplina>();

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public AlunoGraduacao() {

	}

	@Override
	public void solicitarHistorico() {
		// TODO Auto-generated method stub

	}

	@Override
	public void solicitarFrequencia() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inscricaoDisciplina() {
		// TODO Auto-generated method stub

	}
	
}
