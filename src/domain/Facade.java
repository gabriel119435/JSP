package domain;

import java.util.ArrayList;
import java.util.List;
import domain.Pessoa;

public class Facade {

	private static List<Pessoa> repositorioFalso = new ArrayList<Pessoa>();

	public static String somar1(String valor) {
		return "1-" + valor;
	}

	public static String letrar(String valor) {
		if (valor.equals("mulher"))
			return "M";
		if (valor.equals("homem"))
			return "H";
		return "O";
	}

	public static void AdicionaPessoa(String a, String b, String c, String d) {
		repositorioFalso.add(new Pessoa(a, b, c, d));
	}

	public static List<Pessoa> getRepositorioFalso() {
		return repositorioFalso;
	}

}
