package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculoBean {

	private int p_numero, s_numero, resultado;
	
	
	public void soma(){
		setResultado(s_numero + p_numero);
	}
	
	public int getP_numero() {
		return p_numero;
	}
	public void setP_numero(int p_numero) {
		this.p_numero = p_numero;
	}
	public int getS_numero() {
		return s_numero;
	}
	public void setS_numero(int s_numero) {
		this.s_numero = s_numero;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	
	
}
