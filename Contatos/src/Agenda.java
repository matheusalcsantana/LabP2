
/**
 * Classe responsável por armazenar e gerenciar todos os contatos
 * na agenda.
 * 
 * @author Matheus Alcantara
 *
 */
public class Agenda {
	
	/**
	 * Array de objetos da classe Contatos
	 */
	private Contatos[] contato;
	
	/**
	 * Constrói uma agenda, que é capaz de armazenar 100 contatos.
	 */
	public Agenda() {
		this.contato = new Contatos[100];
		}
	
	/**
	 * Cadastra os contatos na agenda.
	 * 
	 * @param pos Posição no array de contatos (1-100)
	 * @param nome Nome do contato
	 * @param sobrenome Sobrenome do contato
	 * @param telefone Numero de telefone do contato
	 * @return Retorna true caso o contato tenha sido criado, caso contrário, retorna false
	 */
	public boolean cadastraContato(int pos, String nome, String sobrenome, String telefone) {
		
		if (nome == null || sobrenome == null || telefone == null) {
			throw new NullPointerException("Nome e/ou sobrenome e/ou telefone nulo(s)");
		}
		
		else if (nome.trim().length() == 0 || sobrenome.trim().length() == 0 || telefone.trim().length() == 0) {
				throw new IllegalArgumentException("Entrada(s) inválidas");
		}
		
		else if (pos < 1 || pos > 100) { 
			return false;
		}
		
		else {	
			contato[pos-1] = new Contatos(nome, sobrenome, telefone);
			return true;
		}
	}
	
	/**
	 * Dado uma posição, retorna o contato que foi cadastrado
	 * naquela posição.
	 * 
	 * @param pos Posição do contato
	 * @return String com o nome, sobrenome e telefone do contato
	 */
	public String exibirContato(int pos) {
		if (contato[pos-1] == null) { return "NÃO HÁ CONTATO NESSA POSIÇÃO!\n";}
		else if (pos < 1 || pos > 100) { return "POSIÇÃO INVÁLIDA!\n";}
		else {return contato[pos-1].toString();}
		
	}
	
	/**
	 * Lista todos os contatos da lista.
	 * 
	 * @return String com todos contatos cadastrados
	 */
	public String listarContato() {
		String str = "";
		for (int i = 0; i < contato.length; i++) {
			if (contato[i] != null) { 
			str += Integer.toString(i+1) + " - " + contato[i].nomeCompleto() + "\n";
			} 
		}
		return str;
	}
}
