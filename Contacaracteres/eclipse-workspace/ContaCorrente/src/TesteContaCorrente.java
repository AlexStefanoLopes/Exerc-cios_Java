
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TesteContaCorrente {

	@Test
	public void deposito() {
		ContaCorrente cc=new ContaCorrente();
		cc.depositar(200);
		assertEquals(cc.saldo,200);
	}

}
