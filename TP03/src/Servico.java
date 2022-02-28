
public class Servico {

	private String tipoDeServico;
	private String formacao;
	private String especificacao;
	
	public boolean cadastrar() {
		return true;
	}
	
	public boolean editar() {
		return true;
	}
	
	public boolean deletar() {
		return true;
	}
	
	public boolean pesquisar() {
		return true;
	}
	
	public boolean visualizar() {
		return true;
	}
	
	public boolean solicitar() {
		return true;
	}

	public String getTipoDeServico() {
		return tipoDeServico;
	}

	public void setTipoDeServico(String tipoDeServico) {
		this.tipoDeServico = tipoDeServico;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	
}
