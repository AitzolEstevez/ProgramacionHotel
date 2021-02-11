
public class Cliente {
	int dni;
	String nombre;
	String apellidos;
	String direccion;
	String localidad;
	
	public Cliente(int dni, String nombre, String apellidos, String direccion, String localidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.localidad = localidad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	public String toString() {
		return "DNI: " + dni + "\nIzena: " + nombre + "\nAbizena: " + apellidos + "\nDireccion: " + direccion + "\nLocalidad: " + localidad;
		
	}
}
