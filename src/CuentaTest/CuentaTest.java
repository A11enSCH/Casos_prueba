package CuentaTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Cuenta.Cuenta;

public class CuentaTest {
	private Cuenta cuenta;
	
	@BeforeEach
	public void setUP() {
		this.cuenta = new Cuenta(1, 1000, "Ahorro");
	}
	
	@Test
	public void ConsignarTest() {
		assertEquals(5000, cuenta.getSaldo());
	}
	
	@Test
	public void RetirarTest() {
		assertEquals(3000, this.cuenta.getSaldo());
	}
}
