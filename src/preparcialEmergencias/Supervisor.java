package preparcialEmergencias;
import java.util.Set;

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
	
	public double calcularCostoTotalMensual(Set<Recurso> recursosUnicos) {
		double costoTotal = 0;
		
		for(Recurso r : recursosUnicos) {
			costoTotal += r.calcularCosto();
		}
		this.facturacionTotal = costoTotal;
		return costoTotal;
	}
	
	public void tiemposAltos(Set<Recurso> recursosUnicos) {
		 int totalExcedido = 0;

		    for (Recurso r : recursosUnicos) {
		        int tiempo = 0;

		        if (r instanceof Ambulancia) {
		            tiempo = ((Ambulancia) r).getTiempoRespuestaMinutos();
		        } else if (r instanceof Bombero) {
		            tiempo = ((Bombero) r).getTiempoRespuestaMinutos();
		        } else if (r instanceof Policia) {
		            tiempo = ((Policia) r).getTiempoRespuestaMinutos();
		        }

		        if (tiempo > 60) {
		            totalExcedido += tiempo - 60;
		        }
		    }

		    this.resultadoAuditoriaTiempos = totalExcedido;
}
	
}
