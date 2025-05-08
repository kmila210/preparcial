package preparcialEmergencias;

public class Ambulancia implements Recurso{
	private double facturacion;
	private int tiempoRespuestaMinutos;

	public Ambulancia(double facturacion, int tiempoRespuestaMinutos) {
		this.facturacion = facturacion;
		this.tiempoRespuestaMinutos = tiempoRespuestaMinutos;
	}
	
	public Ambulancia() {
	}

	public double getFacturacion() {return facturacion;}
	public void setFacturacion(double facturacion) {this.facturacion = facturacion;}

	public int getTiempoRespuestaMinutos() {return tiempoRespuestaMinutos;}
	public void setTiempoRespuestaMinutos(int tiempoRespuestaMinutos) {this.tiempoRespuestaMinutos = tiempoRespuestaMinutos;}

	@Override
	public double calcularCosto() {
		double precio = this.facturacion;
		if(this.tiempoRespuestaMinutos > 50) {
			precio = precio * 0.5;
		}
		return precio;
	}

}
