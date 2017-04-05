package br.com.fiap.repository;

import java.util.Arrays;
import java.util.List;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.entity.Perfume;
import br.com.fiap.exception.WebServiceException;

public class PerfumeRepository {

	private static final String URL = 
			"http://localhost:8080/12-WebserviceRestfull-server-banco/rest/perfume/";
	
	private Client client = Client.create();
	
	public List<Perfume> listar() throws WebServiceException{
		WebResource resource = client.resource(URL);
		//Acessa o WebService
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if(response.getStatus() != 200){
			throw new WebServiceException("Http Status:" + response.getStatus());
		}
		Perfume[] array = response.getEntity(Perfume[].class);
		return Arrays.asList(array);

	}
	
	public Perfume buscar(int codigo) throws WebServiceException{
		WebResource resource = client.resource(URL+codigo);
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		if(response.getStatus() != 200){
			throw new WebServiceException("Http Status: "+response.getStatus());
		}
		return response.getEntity(Perfume.class);
	}
	
	public void cadastrar(Perfume perfume) throws WebServiceException{
		WebResource resource = client.resource(URL);
		ClientResponse response = resource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, perfume);
		
		if(response.getStatus() != 201){
			throw new WebServiceException("Http Status: " + response.getStatus());
		}
	}
	public void atualizar(Perfume perfume) throws WebServiceException{
		WebResource resource = client.resource(URL + perfume.getCodigo());
		ClientResponse response = resource.type(MediaType.APPLICATION_JSON).put(ClientResponse.class, perfume);
		
		if(response.getStatus() != 200){
			throw new WebServiceException("Http Status: " + response.getStatus());
		}
	}
	public void remover(int codigo) throws WebServiceException{
		WebResource resource = client.resource(URL+codigo);
		ClientResponse response = resource.delete(ClientResponse.class);
		
		if(response.getStatus() != 204){
			throw new WebServiceException("Http Status: " + response.getStatus());
		}
	}
}
