package free.com.example.notafacil.modelos;

import java.util.ArrayList;
import java.util.List;

public class Cadeiras {

	private Professor professor;

	private String nomeCadeira;

	private List<Notas> notas = new ArrayList<Notas>();

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getNomeCadeira() {
		return nomeCadeira;
	}

	public void setNomeCadeira(String nomeCadeira) {
		this.nomeCadeira = nomeCadeira;
	}

	public List<Notas> getNotas() {
		return notas;
	}

	public void setNotas(List<Notas> notas) {
		this.notas = notas;
	}

}
