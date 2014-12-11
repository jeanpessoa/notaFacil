package free.com.example.notafacil.modelos;

import java.util.ArrayList;
import java.util.List;

public class Periodos {

	private String nomePeriodo;

	private List<Cadeiras> cadeiras = new ArrayList<Cadeiras>();

	public String getNomePeriodo() {
		return nomePeriodo;
	}

	public void setNomePeriodo(String nomePeriodo) {
		this.nomePeriodo = nomePeriodo;
	}

	public List<Cadeiras> getCadeiras() {
		return cadeiras;
	}

	public void setCadeiras(List<Cadeiras> cadeiras) {
		this.cadeiras = cadeiras;
	}

}
