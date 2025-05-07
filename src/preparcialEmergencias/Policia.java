package preparcialEmergencias;

public class Policia implements Recurso{
	private double facturacion;
	private int tiempoRespuestaMinutos;

	public Policia(double facturacion, int tiempoRespuestaMinutos) {
		this.facturacion = facturacion;
		this.tiempoRespuestaMinutos = tiempoRespuestaMinutos;
	}
	
	public Policia() {
	}

	public double getFacturacion() {return facturacion;}
	public void setFacturacion(double facturacion) {this.facturacion = facturacion;}

	public int getTiempoRespuestaMinutos() {return tiempoRespuestaMinutos;}
	public void setTiempoRespuestaMinutos(int tiempoRespuestaMinutos) {this.tiempoRespuestaMinutos = tiempoRespuestaMinutos;}

	@Override
	public double calcularCosto() {
		double precio = 500;
		if(this.tiempoRespuestaMinutos > 50) {
			precio = precio * 0.5;
		}
		return precio;
	}
}
