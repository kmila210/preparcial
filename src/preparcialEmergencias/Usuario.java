package preparcialEmergencias;

import java.util.ArrayList;

public class Usuario extends Persona {
	private String obraSocial;
	private ArrayList<Recurso> recurso;
	private double facturaUsuario;
	
	public Usuario(String nombre, String apellido, long dni, String obraSocial, ArrayList<Recurso> recurso,
			double facturaUsuario) {
		super(nombre, apellido, dni);
		this.obraSocial = obraSocial;
		this.recurso = recurso;
		this.facturaUsuario = facturacion();
	}
	
	public Usuario() {
		super();
		this.recurso = new ArrayList<>();
	}

	public String getObraSocial() {return obraSocial;}
	public void setObraSocial(String obraSocial) {this.obraSocial = obraSocial;}

	public ArrayList<Recurso> getRecurso() {return recurso;}
	public void setRecurso(ArrayList<Recurso> recurso) {this.recurso = recurso; this.facturaUsuario = facturacion();}

	public double getFacturaUsuario() {return facturaUsuario;}
	public void setFacturaUsuario(double facturaUsuario) {this.facturaUsuario = facturaUsuario;}
	
	public double facturacion() {
		double total = 0;
		for( Recurso r : recurso) {
			if(r instanceof Ambulancia) {
				if(obraSocial == null) {
					total += r.calcularCosto() + 1000;
				}else {
					total += r.calcularCosto();				}
			}else {
				total += r.calcularCosto();
			}
		}
		return this.facturaUsuario = total;
	}
	
}


