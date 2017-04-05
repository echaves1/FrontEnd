package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.entity.Perfume;
import br.com.fiap.repository.PerfumeRepository;

public class ListaTeste {

	public static void main(String[] args) {

		PerfumeRepository rep = new PerfumeRepository();
		try{
			List<Perfume> lista = rep.listar();
			for (Perfume perfume : lista) {
				System.out.println(perfume.getNome());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
