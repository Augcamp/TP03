import java.awt.Image;
import java.util.Date;
import java.util.Scanner;

public abstract class Perfil {
	protected String nome;
	protected String cpf_cnpj;
	protected String  idade;
	protected Image foto;
	protected Endereco endereco;
	static Scanner ler=new Scanner(System.in);
	
	public Perfil(String nome, String cpf_cnpj, String idade, Image foto, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf_cnpj = cpf_cnpj;
		this.idade = idade;
		this.foto = foto;
		this.endereco = endereco;
	}
	
	
	public void cadastrar() {
		String n;
		String cc;
		String i;
		Image f;
		Endereco e;
		System.out.printf("Digite seu nome: ");
		n=ler.nextLine();
		System.out.printf("Digite seu cpf ou cnpj: ");
		cc=ler.nextLine();
		System.out.printf("Digite sua idade: ");
		i=ler.nextLine();
		System.out.printf("Digite seu endereço: ");
		
	}
	

	public void editar() {

	}
	
	public void deletar() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public Date getIdade() {
		return idade;
	}

	public void setIdade(Date idade) {
		this.idade = idade;
	}

	public Image getFoto() {
		return foto;
	}

	public void setFoto(Image foto) {
		this.foto = foto;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
