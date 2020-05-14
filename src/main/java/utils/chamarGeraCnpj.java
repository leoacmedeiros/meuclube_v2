package utils;
import utils.GeraCpfCnpj;;


public class chamarGeraCnpj {
	
	public static void main(String[] args) {
		GeraCpfCnpj gerador = new GeraCpfCnpj();
		/*
		String cpf = gerador.cpf(true);
		
		System.out.printf("CPF: %s, Valido: %s\n", cpf, gerador.isCPF(cpf));
		 
		String cnpj = gerador.cnpj(false);
		System.out.printf("CNPJ: %s, Valido: %s\n", cnpj, gerador.isCNPJ(cnpj));

		String rg = gerador.rg(true);
		System.out.printf("RG: %s", rg);
		*/
		String cnpj = gerador.cnpj(false);
		System.out.printf(cnpj);
		
	}
	

}
