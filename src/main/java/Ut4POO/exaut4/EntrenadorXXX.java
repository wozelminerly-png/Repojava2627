package ut4POO.exaut4;

public class EntrenadorXXX extends IntegranteSeleccionXXX {
	 private String codFederacion;

	    public EntrenadorXXX(int id, String nombre, String apellidos, int edad, String codFederacion) {
	        super(id, nombre, apellidos, edad);
	        this.codFederacion = codFederacion;
	    }

	    public void dirigirPartido() {
	        System.out.println(getNombreCompleto() + " -> Dirige el partido desde la banda.");
	    }

	    public void dirigirEntrenamiento() {
	        System.out.println(getNombreCompleto() + " -> Dirige el entrenamiento táctico.");
	    }

		@Override
		public String toString() {
			return "EntrenadorXXX [idFederacion=" + codFederacion + ", getNombreCompleto()=" + getNombreCompleto()
					+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ "]";
		}
	    
}
