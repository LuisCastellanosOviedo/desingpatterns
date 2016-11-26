package anotaciones;

public class CalcImpuestos {
	
	private IServicioRemoto servicioRemotoGetImpuestos;
	
	
	
	public CalcImpuestos() {
		// TODO Auto-generated constructor stub
	}
	
	public int consultarImpuestoByIdUser(int idUser){
		return servicioRemotoGetImpuestos.getImpuestoUsuario(idUser);
	}

}
