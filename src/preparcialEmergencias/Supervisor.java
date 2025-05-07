package preparcialEmergencias;

public class Supervisor extends Persona{
	private double facturacionTotal;
	private int resultadoAuditoriaTiempos;
	
	public Supervisor(String nombre, String apellido, long dni, double facturacionTotal,
			int resultadoAuditoriaTiempos) {
		super(nombre, apellido, dni);
		this.facturacionTotal = facturacionTotal;
		this.resultadoAuditoriaTiempos = resultadoAuditoriaTiempos;
	}
	
	public Supervisor(){
		super();
	}

	public double getFacturacionTotal() {return facturacionTotal;}
	public void setFacturacionTotal(double facturacionTotal) {this.facturacionTotal = facturacionTotal;}

	public int getResultadoAuditoriaTiempos() {return resultadoAuditoriaTiempos;}
	public void setResultadoAuditoriaTiempos(int resultadoAuditoriaTiempos) {this.resultadoAuditoriaTiempos = resultadoAuditoriaTiempos;}
	
	public double calcularCostoTotalMensual(Recurso r) {
		return 0;
	}
	
	public void tiemposAltos(Recurso r) {
	}
}
