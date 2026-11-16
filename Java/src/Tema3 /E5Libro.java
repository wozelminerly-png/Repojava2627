package Tema3;

public class E5Libro extends Object{
	private final String titulo;
	private final String autor;
	private final int paginasTotal;
	private int paginasLeidas;
	
	public E5Libro (String paraTitulo, String paraAutor, int paraPaginatotal) {
		this.titulo=paraTitulo;
		this.autor=paraAutor;
		this.paginasTotal=paraPaginatotal;
		this.paginasLeidas=0;
	}
	
	public void leer (int paginas) {
		paginasLeidas += paginas;
		if (paginasLeidas >= paginasTotal){
			paginasLeidas = paginasTotal;
		}
		System.out.println("Has leído: "+paginasLeidas+" de "+paginasTotal+" página");
	}
	
	public boolean estaTerminado() {
		boolean terminado = true;
		if (paginasLeidas < paginasTotal) {
			terminado = false;
		}
		return terminado;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	public int getPaginasTotal() {
		return this.paginasTotal;
	}
	public int getPaginasLeidas() {
		return this.paginasLeidas;
	}
	
	public void mostrarInformacion() {
		System.out.println("Título: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Páginas totales: "+paginasTotal);
		System.out.println("Páginas leídas: "+paginasLeidas);
		
	}

}
