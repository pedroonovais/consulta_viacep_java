package app;

import java.io.IOException;

import model.Endereco;
import service.ViaCepService;

public class Main {
	public static void main(String[] args) {
		
		ViaCepService viacepService = new ViaCepService();
		
		try {
			System.out.println(viacepService.getEndereco("01311000"));
			System.out.println("===================================");
			Endereco endereco = viacepService.getEndereco("08280260");
			System.out.println("Rua: " + endereco.getLogradouro());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("Cidade: " + endereco.getLocalidade());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
