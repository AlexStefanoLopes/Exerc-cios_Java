
import static org.junit.jupiter.api.Assertions.*;

public class TesteContaCorrente {

	@Test
	public void deposito() {
		ContaCorrente cc=new ContaCorrente();
		cc.depositar(200);
		assertEquals(cc.saldo,200);
	}

}
