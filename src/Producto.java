
public class Producto {
	//ATRIBUTOS

	private int cantidadproducto;
	private String eleccionproducto;
	String categoriaproducto;
	
	private void Producto (int cantidadproducto, String eleccionprodcuto, String categoriaproducto) {
	
		this.cantidadproducto= cantidadproducto;
		this.eleccionproducto= eleccionproducto;
		this.categoriaproducto= categoriaproducto;
		
	}

int getcantidadproducto() {
    return cantidadproducto;
}


public void setcantidadproducto(int cantidadproducto) {
    this.cantidadproducto = cantidadproducto;
}


public String geteleccionproducto() {
    return eleccionproducto;
}


public void seteleccionproducto(String eleccionproducto) {
    this.eleccionproducto = eleccionproducto;
}
public String geteleccionproducto1() {
    return eleccionproducto;
}


public void setcategoriaproducto(String categoriaproducto) {
    this.categoriaproducto = categoriaproducto;
}}


