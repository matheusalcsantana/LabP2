
import org.junit.*;
import static org.junit.Assert.*;

public class ContatosTeste {
	
	private Contatos contato;
	
	@Before
	public void criaContato() {
		this.contato = new Contatos("Matheus", "Santana", "8799656879"); 
	}
	
	@Test
	public void toStringTest() {
		assertEquals("Devem ter o mesmo valor",contato.toString(), "Matheus Santana - 8799656879");
	}
	
	@Test
	public void nomeCompletoTest() {
		assertEquals("Devem ter o mesmo valor", contato.nomeCompleto(), "Matheus Santana");
	}

}
