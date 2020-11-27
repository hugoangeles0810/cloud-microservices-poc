package pe.edu.unp.poc.microservices.tracking.models;

public class Pedidos {

	public int numero;
	public String usuario;
	public String courier;
	public String ubicacion;
	
	public Pedidos(int numero, String usuario, String courier, String ubicacion) {
		// TODO Auto-generated constructor stub
		this.numero=numero;
		this.usuario=usuario;
		this.courier=courier;
		this.ubicacion=ubicacion;
	}
}
