package free.com.example.notafacil.modelos;

public class Curso {

	private Periodos periodos;
	private Cadeiras cadeiras;
	private Aluno aluno;

	private String nomeCurso;

	public Periodos getPeriodos() {
		return periodos;
	}

	public void setPeriodos(Periodos periodos) {
		this.periodos = periodos;
	}

	public Cadeiras getCadeiras() {
		return cadeiras;
	}

	public void setCadeiras(Cadeiras cadeiras) {
		this.cadeiras = cadeiras;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

}
