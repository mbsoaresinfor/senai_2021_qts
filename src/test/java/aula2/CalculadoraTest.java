package aula2;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalculadoraTest {

	
	@Test
	public void testSomar() {
		
		Calculadora calc = new Calculadora();
		int entrada1 = 2;
		int entrada2 = 3;
		int resultadoExperado = 5;
		int resultadoPrograma = calc.somar(entrada1, entrada2);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);
		
	}
	
	@Test
	public void testSubrair() {
		
		Calculadora calc = new Calculadora();
		int entrada1 = 10;
		int entrada2 = 4;
		int resultadoExperado = 6;
		int resultadoPrograma = calc.subtrair(entrada1, entrada2);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);
		
	}
	
	@Test
	public void testDivisao() {
		
		Calculadora calc = new Calculadora();
		int entrada1 = 20;
		int entrada2 = 2;
		int resultadoExperado = 10;
		int resultadoPrograma = calc.dividir(entrada1, entrada2);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);
		
	}
	
	@Test
	public void testMultiplicacao() {
		
		Calculadora calc = new Calculadora();
		int entrada1 = 30;
		int entrada2 = 1;
		int resultadoExperado = 30;
		int resultadoPrograma = calc.multiplicar(entrada1, entrada2);
		Assert.assertEquals(resultadoExperado, resultadoPrograma);
		
	}

}
