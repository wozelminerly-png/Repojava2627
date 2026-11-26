package ut4POO.exaut4;

public class JugadorXXX extends IntegranteSeleccionXXX {
	 private int dorsal;
	    private String demarcacion;

	    public JugadorXXX(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
	        super(id, nombre, apellidos, edad); // Llama al constructor del padre
	        this.dorsal = dorsal;
	        this.demarcacion = demarcacion;
	    }

	    // Implementación de métodos abstractos o propios
	    public void jugarPartido() {
	        System.out.println(getNombreCompleto() + " -> Está jugando un partido (Dorsal: " + dorsal + ")");
	    }

	    public void entrenar() {
	        System.out.println(getNombreCompleto() + " -> Está entrenando en la cancha.");
	    }
	    
	    // Sobrescribimos el método viajar (Polimorfismo) para dar un ejemplo
	    @Override
	    public void viajar() {
	        System.out.println(getNombreCompleto() + " -> Viaja con auriculares puestos.");
	    }
}
