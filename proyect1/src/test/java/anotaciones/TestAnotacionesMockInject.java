package anotaciones;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class TestAnotacionesMockInject {
	
	
	@Mock(name="ServicioRemotoGetImpuestos") IServicioRemoto servicioRemotoMock;
	
	@InjectMocks CalcImpuestos calcImpuestos  = new CalcImpuestos();
	
	@Test
	public void testAnotaciones( ){
		when(servicioRemotoMock.getImpuestoUsuario(anyInt())).thenReturn(99);
		int res = calcImpuestos.consultarImpuestoByIdUser(anyInt());
		
		
		assertEquals(res, 99);
	}
	
	@Test
	public void testAnotacionesGiven( ){
		when(servicioRemotoMock.getImpuestoUsuario(anyInt())).thenReturn(99);
		int res = calcImpuestos.consultarImpuestoByIdUser(anyInt());
		
		
		assertEquals(res, 99);
	}

}
