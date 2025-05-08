package preparcialEmergencias;

public class Persona {
	private String nombre;
	private String apellido;
	private long dni;
	
	public Persona(String nombre, String apellido, long dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public Persona() {
	}

	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public String getApellido() { return apellido; }
	public void setApellido(String apellido) { this.apellido = apellido; }

	public long getDni() { return dni; }
	public void setDni(long dni) { this.dni = dni; }

	@Override
	public String toString() {
		return "Persona [Nombre=" + nombre + ", Apellido=" + apellido + ", dni=" + dni + "]";
	}

}
