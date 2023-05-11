package aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoPosGraduacao extends pessoa.Pessoa implements SolicitacoesAluno {
	
	private int modulo;
	private String trabalhoConclusao;

	List<disciplina.Disciplina> disciplina = new ArrayList<disciplina.Disciplina>();

	public int getModulo() {
		return modulo;
	}

	public void setModulo(int modulo) {
		this.modulo = modulo;
	}

	public String getTrabalhoConclusao() {
		return trabalhoConclusao;
	}

	public void setTrabalhoConclusao(String trabalhoConclusao) {
		this.trabalhoConclusao = trabalhoConclusao;
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
