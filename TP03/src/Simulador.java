
public class Simulador {

	public static void main(String[] args) {
	
		//Servico service = new Servico("Eletricista", "Sem formacao", 0, 0);
		//String seervice;
		
		Endereco e = new Endereco("Brasil", "72565656", "Rec da Ema", "Quadra 09", "PI");
		PerfilDoCliente pdc = new PerfilDoCliente("Aug Camp", "069.198.091-84", "19", e);
	
		System.out.printf("%s - %s - %s", pdc.getNome(), pdc.getCpf_cnpj(), pdc.getIdade());
		System.out.println(" ");
		System.out.printf("%s - %s - %s - %s - %s", pdc.endereco.getPais(), 
													pdc.endereco.getUf(),
													pdc.endereco.getCidade(),
													pdc.endereco.getCep(),
													pdc.endereco.getLogradouro());

		
	}

}
