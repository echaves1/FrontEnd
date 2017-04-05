package br.com.fiap.teste;

import br.com.fiap.entity.Perfume;
import br.com.fiap.exception.WebServiceException;
import br.com.fiap.repository.PerfumeRepository;

public class TesteAtualizar {

	public static void main(String[] args) {

		PerfumeRepository rep = new PerfumeRepository();
		
		Perfume p = new Perfume(0, "Animals", "Amadeirado", 10);
		try {
			rep.atualizar(p);
			System.out.println("Atualizado!");
		} catch (WebServiceException e) {
			System.err.println("Deu ruim");
			e.printStackTrace();
		}
		
		
	}

}
