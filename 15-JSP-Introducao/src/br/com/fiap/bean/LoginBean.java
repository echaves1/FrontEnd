package br.com.fiap.bean;

/// ++++++++++++ CUIDADO COM O IMPORT ++++++++++++
import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {

	private String login;
	private String senha;
	
	//Método para o clique do botão
	public void validarLogin(){
		System.out.println(login + "" + senha);
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
