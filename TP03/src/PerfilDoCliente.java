//import java.awt.Image;

public class PerfilDoCliente extends Perfil {

	public PerfilDoCliente(String nome, String cpf_cnpj, String idade,/*Image foto,*/ Endereco endereco) {
		super( nome,  cpf_cnpj,  idade,  /*foto,*/  endereco);
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	/*public boolean pesquisar() {
		return true;
	}*/
	

	public void visualizar() {
		Endereco e = new Endereco("null","null","null","null","null");

		System.out.printf("%s - %s - %s", nome, cpf_cnpj, idade);
		System.out.println(" ");
		System.out.printf("F O T O   B O N I T I N H A ");
		System.out.println(" ");
		System.out.printf("%s - %s - %s- %s - %s", e.getPais(), e.getUf(), e.getCidade(), e.getCep(), e.getLogradouro());
		System.out.println(" ");
	}
	
}
