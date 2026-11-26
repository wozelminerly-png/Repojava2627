package ut4POO.exaut4;

public class IntegranteSeleccionXXX {
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;

    public IntegranteSeleccionXXX(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Métodos comunes a todos (Padre e Hijos)
    public void concentrarse() {
        System.out.println(this.nombre + " " + this.apellidos + " -> Se ha concentrado con la Selección.");
    }

    public void viajar() {
        System.out.println(this.nombre + " " + this.apellidos + " -> Viaja con la Selección.");
    }

    // Getters básicos para identificación
    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

	@Override
	public String toString() {
		return "IntegranteSeleccionXXX [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ "]";
	}
    
}
