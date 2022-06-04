
public class Compañia {
	
	//ATRIBUTOS

	public String nombre;
	public int numero;
	public String email;
	public String direcciones;
	public String inventario;
	
	public Compañia(String nombre, int numero, String email, String direcciones, String inventario) {
	
		this.nombre= nombre;
		this.numero= numero;
		this.email= email;
		this.direcciones = direcciones;
		this.inventario = inventario;
		
	}

public Compañia() {
		// TODO Auto-generated constructor stub
	}

public String getnombre() {
    return nombre;
}


public void setnombre(String nombre) {
    this.nombre = nombre;
}


public int getnumero() {
    return numero;
}


public void setnumero(int numero) {
    this.numero = numero;
}


public String getemail() {
    return email;
}


public void setemail(String email) {
    this.email = email;
}


public String getdirecciones() {
    return direcciones;
}


public void setdirecciones(String direcciones) {
    this.direcciones = direcciones;
}


public String inventario() {
    return inventario;
}


public void setinventario(String inventario) {
    this.inventario = inventario;

}
}