import java.util.Scanner;

public class Servico {

	static Scanner ler=new Scanner(System.in);
	private String tipoDeServico[] = new String[4];
	private String formacao[] = new String[3];
	//private String especificacao ;
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public Servico(String tipoDeServico, String formacao, int i, int j) {
		this.tipoDeServico[i] = tipoDeServico;
		this.formacao[j] = formacao;
		//this.especificacao = especificacao;
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public int cadastrar() {
		int i;

		System.out.println("Qual a sua area de atuacao:");
		visualizar();
		i=ler.nextInt();
		
		return i;
	}
	public String cadastrar(String formacao[]) {
		int j;

		System.out.println("Qual a sua formacao na area: ");
		System.out.println("0 - Sem formacao ");
		System.out.println("1 - Tecnico");
		System.out.println("2 - Superior");
		System.out.println("3 - Mestre");
		j=ler.nextInt();

		return formacao[j];
	}
	
	public void editar() {
		
		String desejada;
		int i, j;

        System.out.println("Escolha o que deseja editar: ");
        desejada = ler.nextLine();
        desejada = desejada.toLowerCase(); 

        switch (desejada) {
            case "area de atuacao":
                System.out.println("Digite a sua area de atuacao: ");
                i = ler.nextInt();
                     
                System.out.println(tipoDeServico[i]);
                break;
            
            case "formacao":
                System.out.println("Digite a sua formacao: ");
                j = ler.nextInt();
                     
                System.out.println(formacao[j]);
                break;            
            
            default:
                break;
        }
		
	}
	
	public void visualizar() {
		System.out.println(" ---------------- NOSSOS SERVICOS ---------------- ");
		System.out.println("0 - Eletricista ");
		System.out.println("1 - Mecanico ");
		System.out.println("2 - Encanador(a) ");
		System.out.println("3 - Faxineiro(a) ");
		System.out.println("4 - Cozinheiro(a) ");

	}

	public void pesquisar() {
		//FAREMOS DEPOIS
		//REALIZAR PESQUISA PELO TIPO DE SERVICO E MOSTRAR TODOS OS PROFISSIONAIS CADASTRADOS NO TIPO
	}
	
	public void solicitar() {
		//FAREMOS DEPOIS
		//CHAT COM FUNCIONARIO, ESTILO DE MULTIPLA ESCOLHA
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public String getTipoDeServico(int i) {
		return tipoDeServico[i];
    }

    public void setTipoDeServico(String tipoDeServico, int i) {
        this.tipoDeServico[i] = tipoDeServico;
    }

    public String[] getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao, int j) {
        this.formacao[j] = formacao;
    }
}
