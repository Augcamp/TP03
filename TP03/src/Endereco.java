import java.util.Scanner;

public class Endereco {

	static Scanner ler=new Scanner(System.in);
	private String pais;
	private String cep;
	private String cidade;
	private String logradouro;
	private String uf;
	
	
	public Endereco(String pais, String cep, String cidade, String logradouro, String uf) {
		super();
		this.pais = pais;
		this.cep = cep;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.uf = uf;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public void cadastrar() {
		
		System.out.println("Digite o nome do seu pais: ");
		pais=ler.nextLine();
		
		System.out.println("Digite o seu cep: ");
		cep=ler.nextLine();
		
		System.out.println("Digite sua cidade: ");
		cidade=ler.nextLine();
		
		System.out.println("Digite o seu logradouro: ");
		logradouro=ler.nextLine();
		
		System.out.println("Digite sua UF: ");
		uf=ler.nextLine();
		
	}
	
	public void editar() {
		System.out.println("Escolha o que deseja editar: "
				+ "P - Para País, C - Para Cep, D -  Para Cidade, L - Para Lograoduro, U - Para UF.");
		
	}
	
	public void deletar() {

	}
	
	public void visualizar() {

	}
}
