import java.awt.Image;
import java.util.Date;

public abstract class Perfil {
	protected String nome;
	protected String cpf_cnpj;
	protected Date  idade;
	protected Image foto;
	protected Endereco endereco;
	
	public boolean cadastrar() {
		return true;
	}
	
	public boolean editar() {
		return true;
	}
	
	public boolean deletar() {
		return true;
	}
}
