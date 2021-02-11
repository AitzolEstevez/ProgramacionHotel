
public class Hotel {
int id;
int cif;
String nombre;
String gerente;
int estrellas;
String compania;

	public Hotel(int id, int cif, String nombre, String gerente, int estrellas, String compania) {
		this.id = id;
		this.cif = cif;
		this.nombre = nombre;
		this.gerente = gerente;
		this.estrellas = estrellas;
		this.compania = compania;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCif() {
		return cif;
	}

	public void setCif(int cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public int getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compañia) {
		this.compania = compañia;
	}

	
	public String toString() {
		return "Hotel [id=" + id + ", cif=" + cif + ", nombre=" + nombre + ", gerente=" + gerente + ", estrellas="
				+ estrellas + ", compañia=" + compania + "]";
	}
	
	
}
