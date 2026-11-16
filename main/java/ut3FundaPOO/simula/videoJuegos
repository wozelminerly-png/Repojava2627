package ut3FundaPOO.simula;

public class Videojuego {
	private String titulo;
	private String plataforma;
	private double precio;
	private static int totalVideojuegos;
	
	public Videojuego(String titulo, String plataforma, double precio) {
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.precio = precio;
		totalVideojuegos++; //Se incrementa el contador cuando se use el constructor
	}
	
	public static int getTotalVideojuegos() {
		return totalVideojuegos;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", plataforma=" + plataforma + ", precio=" + precio + "]";
	}
}
