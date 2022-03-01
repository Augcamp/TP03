import java.util.Scanner;

public class Contato {

	static Scanner ler=new Scanner(System.in);
	private String telefone;
	private String email;
	
	public Contato(String telefone, String email) {
		telefone = telefone;
		email = email;
		
	}
	
	
	public void cadastrar() {
		System.out.println("Digite o seu telefone:");
		telefone=ler.nextLine();
		
		System.out.println("Digite o seu email: ");
		email=ler.nextLine();
	}
	
	public void editar() {
		
		String desejada, nova;

        System.out.println("Escolha o que deseja editar: ");
        desejada = ler.nextLine();
        desejada = desejada.toLowerCase(); 

        switch (desejada) {
            case "telefone":
            	System.out.println(telefone);
                System.out.println("Digite seu novo telefone: ");
                nova = ler.nextLine();
                telefone = telefone.replace(telefone, nova);       
                System.out.println(telefone);
                break;
            
            case "email":
            	
                System.out.println("Digite o novo email: ");
                nova = ler.nextLine();
                email = email.replace(email, nova);               

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
            case "telefone":
            	
                telefone = telefone.replace(telefone, "Telefone não cadastrado");       
              
                break;
            
            case "email":

                email = email.replace(email, "Email não cadastrado");                  
                
                break;
            
            default:
                break;
        }
	}
	
	public void visualizar() {
		System.out.printf("%s - %s",telefone, email);
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
