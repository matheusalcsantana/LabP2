import static org.junit.Assert.*;
import org.junit.*;

public class AgendaTest {
	
	private Agenda agenda;
	String nome = "Nome";
	String sobrenome = "Sobrenome";
	String telefone = "Numero";

	
	@Before
	public void criarAgenda() {
		this.agenda = new Agenda();
	}
	@Test
	public void cadastraContatoTest() {
				
		assertTrue("Deve retornar V", agenda.cadastraContato(1, nome, sobrenome, telefone));
		assertFalse("Deve retornar F", agenda.cadastraContato(0, nome, sobrenome, telefone));
		assertFalse("Deve retornar F", agenda.cadastraContato(101, nome, sobrenome, telefone));
		
	}
	
	@Test(expected = NullPointerException.class)
	public void cadastraContatonullTest() {
		agenda.cadastraContato(1, null, "Sbrnome", "numero");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void cadastraContatoinvalidoTest() {
		agenda.cadastraContato(1, "   ", " ", "  ");
	}
	
	@Test
	public void exibirContatoTest() {
		agenda.cadastraContato(1, nome, sobrenome, telefone);
		assertEquals(agenda.exibirContato(1), "Nome Sobrenome - Numero");
		agenda.cadastraContato(1, "Otonome", "Otosobrenome", "Otonumero");
		assertEquals("Otonome Otosobrenome - Otonumero", agenda.exibirContato(1));
		agenda.cadastraContato(50, nome, sobrenome, telefone);
		assertEquals("Nome Sobrenome - Numero", agenda.exibirContato(50));
	}
	
	@Test
	public void listarContatoTest() {
		agenda.cadastraContato(1, nome, sobrenome, telefone);
		assertEquals(agenda.listarContato(), "1 - Nome Sobrenome\n");
		agenda.cadastraContato(13, nome, sobrenome, telefone);
		assertEquals(agenda.listarContato(), "1 - Nome Sobrenome\n13 - Nome Sobrenome\n");
	}
	
	
}
