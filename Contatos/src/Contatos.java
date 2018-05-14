/**
 * 
 * Na agenda, cada contato tem nome, sobrenome e telefone.
 * Esse classe é responsável por construir um contato com
 * essas características.
 * 
 * @author Matheus Alcantara
 *
 */
public class Contatos {
	/**
	 * Nome do contato
	 */
	private String nome;
	/**
	 * Sobrenome do contato
	 */
	private String sobrenome;
	/**
	 * Telefone do contato
	 */
	private String telefone;
	
	/**
	 * Construtor da classe, responsável por receber as 
	 * informações necessárias e criar um contato.
	 * 
	 * @param nome Nome do contato
	 * @param sobrenome Sobrenome do contato
	 * @param telefone Telefone do contato
	 */
	public Contatos(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	/**
	 * Método que retorna o nome, sobrenome e telefone do contato.
	 * 
	 * @return String contendo nome, sobrenome e telefone do contato
	 */
	public String toString() { return nome + " " + sobrenome + " - " + telefone;}
	
	/**
	 * Método que retorna nome e sobrenome do contato.
	 * 
	 * @return String contendo nome e sobrenome do contato.
	 */
	public String nomeCompleto() { return nome + " " + sobrenome;}
	
	//public boolean (Object obj) {
		//Contatos c = (Contatos) obj;
		
	//}
}

