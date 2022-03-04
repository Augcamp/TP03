import java.util.Scanner;

public class Endereco {

	static Scanner ler=new Scanner(System.in);
	private String pais;
	private String cep;
	private String cidade;
	private String logradouro;
	private String uf;
	
	
	public Endereco(String pais, String cep, String cidade, String logradouro, String uf) {
		this.pais = pais;
		this.cep = cep;
		this.cidade = cidade;
		this.logradouro = logradouro;
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
		String desejada, nova;

        System.out.println("Escolha o que deseja editar: ");
        desejada = ler.nextLine();
        desejada = desejada.toLowerCase(); 

        switch (desejada) {
            case "pais":
            	System.out.println(pais);
                System.out.println("Digite o novo pais: ");
                nova = ler.nextLine();
                pais = pais.replace(pais, nova);       
                System.out.println(pais);
                break;
            
            case "cep":
            	
                System.out.println("Digite o novo cep: ");
                nova = ler.nextLine();
                cep = cep.replace(cep, nova);               
               
                
                break;
            
            case "cidade":
            	System.out.println("Digite a nova cidade: ");
                nova = ler.nextLine();
                cidade = cidade.replace(cidade, nova);  
                
                break;

            case "logradouro":
            	System.out.println("Digite o novo logradouro: ");
                nova = ler.nextLine();
                logradouro = logradouro.replace(logradouro, nova);  
                
                break;

            case "uf":
            	System.out.println("Digite a nova UF: ");
                nova = ler.nextLine();
                uf = uf.replace(uf, nova);  
                
                break;
            
            default:
                break;
        }
		
	}
	
	public void deletar() {
		String desejada;

        System.out.println("Escolha o que deseja deletar: ");
        desejada = ler.nextLine();
        desejada = desejada.toLowerCase(); 

        switch (desejada) {
            case "pais":
            	
                pais = pais.replace(pais, "pais n�o cadastrado");       
              
                break;
            
            case "cep":

                cep = cep.replace(cep, "Cep n�o cadastrado");                  
                
                break;
            
            case "cidade":

                cidade = cidade.replace(cidade, "Cidade n�o cadastrada");  
                
                break;

            case "logradouro":
            	
                logradouro = logradouro.replace(logradouro, "Logradouro n�o cadastrado");  
                
                break;

            case "uf":
           
                uf = uf.replace(uf, "UF n�o cadastrada");  
                
                break;
            
            default:
                break;
        }
	}
	
	public void visualizar() {
		System.out.printf("%s - %s - %s - %s - %s",pais, cep, cidade, logradouro, uf);
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
}


