package br.com.fiap.teste;

import br.com.fiap.entity.Perfume;
import br.com.fiap.exception.WebServiceException;
import br.com.fiap.repository.PerfumeRepository;

public class TesteCadastrar {

	public static void main(String[] args) {

		PerfumeRepository rep = new PerfumeRepository();
		
		Perfume p = new Perfume(0, "212", "Cheiro Bom da porra", 5);
		
		try {
			rep.cadastrar(p);
			System.out.println("Sucesso!");
		} catch (WebServiceException e) {
			e.printStackTrace();
		}
	}
}
