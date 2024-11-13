package contructorExample;

public class sistemaCadastro {
	
	public static void main (String[] args) {
		Pessoa marcos = new Pessoa("1231232121","Ruas das marias");
		
		marcos.setEndereco("Rua das marias");
		
		System.out.println(marcos.getNome() + " - " + marcos.getCpf());
	}

}
