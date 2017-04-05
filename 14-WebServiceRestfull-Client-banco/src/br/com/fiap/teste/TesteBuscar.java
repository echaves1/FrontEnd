package br.com.fiap.teste;

import br.com.fiap.entity.Perfume;
import br.com.fiap.exception.WebServiceException;
import br.com.fiap.repository.PerfumeRepository;

public class TesteBuscar {

	public static void main(String[] args) {

		PerfumeRepository rep = new PerfumeRepository();
		
		try {
			Perfume p = rep.buscar(2);
			System.out.println("Perfume:" + p.getNome() + "\nCodigo:" + p.getCodigo());
		} catch (WebServiceException e) {
			e.printStackTrace();
		}
		
	}

}
