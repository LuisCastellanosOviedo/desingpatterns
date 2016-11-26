package proyect1.proyect1.ejercicio3;

import java.util.HashMap;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class) 
public class Ejercicio3 {

	
	public HashMap<String, String> sut = new HashMap<String, String>();
	
	@SuppressWarnings(value="all")
	private static final Object[] getTestValuesForMap() {
		 return $(
		 $("key",""),
		 $("key","1"),
		 $("key","11"),
		 $("key",null)
		 );
		}
	
	
	
	
	@Test
	@Parameters(method = "getTestValuesForMap") 
	public void testPut(String key,String value){
		sut.put(key, value);
		assertEquals(value, sut.get(key));
	}
	
	@Test(expected = Exception.class)
	@Parameters(method = "getTestValuesForMap") 
	public void testPutDouble(String key,String value){
		sut.put(key, value);
		sut.put(key, "fff");
		assertEquals("fff", sut.get(key));
	}
	
}
