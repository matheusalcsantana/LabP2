import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String msg = "(C)adastrar Contato\n" + "(L)istar Contatos\n" + "(E)xibir Contato\n" + "(S)air\n" + "\nOPÇÃO> ";
		String entrada;
		Agenda agenda = new Agenda();
		
		do {
			entrada = inString(msg, sc);
			
			switch (entrada) {
			
				case "C":
					int pos = Integer.parseInt(inString("\nPosição: ", sc));
					String nome = inString("Nome: ", sc);
					String sbrnome = inString("Sobrenome: ", sc);
					String tel = inString("Telefone: ", sc);
					
					if (agenda.cadastraContato(pos, nome, sbrnome, tel)) {
						System.out.println("CADASTRO REALIZADO COM SUCESSO!\n");
					}
					else {
						System.out.println("POSIÇÃO INVÁLIDA!\n");
					}
					break;
				case "L":
					System.out.println("\n" + agenda.listarContato());
					break;
				case "E":
					int p = Integer.parseInt(inString("\nContato> ", sc));
					System.out.println(agenda.exibirContato(p) + "\n");
					break;
				case "S":
					break;
				default:
					System.out.println("OPÇÃO INVÁLIDA!\n");
					
			}
		}while (!(entrada.equals("S")));
	}
	
	public static String inString (String msg, Scanner sc) {
		System.out.print(msg);
		String saida = sc.nextLine();
		return saida;
	}
	
}
