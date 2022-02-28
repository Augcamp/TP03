
public class Contato {

	private String[] telefone = new String[2];
	private String email;
	
	
	public boolean cadastrar() {
		return true;
	}
	
	public String[] getTelefone() {
		return telefone;
	}

	public void setTelefone(String[] telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean editar() {
		return true;
	}
	
	public boolean deletar() {
		return true;
	}

}
