package Tema3;

public class E5LibroTest {
	public static void main(String[] args) {
	E5Libro libro1 = new E5Libro("Cien años de soledad","Gabriel García Marquéz", 417);
	 libro1.mostrarInformacion();
     libro1.leer(100);
     libro1.leer(200);
     libro1.leer(150);
    
    if(libro1.estaTerminado()) {
       System.out.println("¡Has terminado el libro!");
    }else {
       System.out.println("Aún no has terminado, siguen leyendo");
    }
    
     System.out.println();
     libro1.mostrarInformacion();
	}
}
