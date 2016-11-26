package proyect1.proyect1.ejercicio2;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static org.junit.Assert.*;
import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class) 
public class StringReverseTest {
	
	@SuppressWarnings(value="all")
	private static final Object[] getStrings() {
		 return $(
		 $(""),
		 $("a"),
		 $("aa"),
		 $("aba"),
		 $("anitalavalatina")
		 );
		}
	
	

	
	@Test
	@Parameters(method = "getStrings") 
	public void valoresInicialesIguales(String string){
		assertEquals(string,StringReverse.reverse(string));
	}
	
	@Test
	public void dosLetras(){
		assertEquals("ab",StringReverse.reverse("ba"));
	}

	
	@Test
	public void testNumbers(){
		assertEquals("34",StringReverse.reverse("43"));
	}
	
	@Test
	public void excCharacter(){
		assertEquals("#*",StringReverse.reverse("*#"));
	}
	
}
