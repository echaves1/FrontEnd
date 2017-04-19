package br.com.fiap.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.fiap.bo.TimeBOStub;
import br.com.fiap.bo.TimeBOStub.Buscar;
import br.com.fiap.bo.TimeBOStub.Cadastrar;
import br.com.fiap.bo.TimeBOStub.Time;

@ManagedBean
public class TimeBean {

	private Time time;

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
	@PostConstruct //Metodo de inicialização
	public void inicialicacao(){
			time = new Time();
	}
	
	public String cadastrar(){
		try {
			TimeBOStub stub = new TimeBOStub();
			Cadastrar params = new Cadastrar();
			params.setTime(time);
			stub.cadastrar(params);
		} catch (Exception e) {
			e.printStackTrace();
			return "cadastro-time";
		}
		return "pesquisa-de-time";
	}
	

}
