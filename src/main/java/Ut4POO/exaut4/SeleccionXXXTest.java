package ut4POO.exaut4;

public class SeleccionXXXTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// --- 1. Creación de Objetos ---
		EntrenadorXXX entrenador = new EntrenadorXXX(1, "Steve", "Kerr", 58, "USA-FED-001");
		JugadorXXX jugador1 = new JugadorXXX(2, "LeBron", "James", 39, 23, "Alero");
		JugadorXXX jugador2 = new JugadorXXX(3, "Stephen", "Curry", 36, 30, "Base");
		MasajistaXXX masajista = new MasajistaXXX(4, "Juan", "Pérez", 45, "Fisioterapeuta Deportivo", 20);

		System.out.println("=== 1. TODOS SE CONCENTRAN Y VIAJAN (MÉTODOS COMUNES) ===");

		// Entrenador
		System.out.print("Entrenador: ");
		entrenador.concentrarse();
		entrenador.viajar();

		// Jugadores
		System.out.print("Jugador: ");
		jugador1.concentrarse();
		jugador1.viajar();

		System.out.print("Jugador: ");
		jugador2.concentrarse();
		jugador2.viajar();

		// Masajista
		System.out.print("Masajista: ");
		masajista.concentrarse();
		masajista.viajar();

		System.out.println("\n=== 2. TAREAS ESPECÍFICAS (CADA UNO SU ROL) ===");		
		entrenador.dirigirEntrenamiento();
		entrenador.dirigirPartido();
		System.out.println("-------------------");

		jugador1.entrenar();
		jugador1.jugarPartido();
		System.out.println("-------------------");

		jugador2.entrenar();
		jugador2.jugarPartido();
		System.out.println("-------------------");

		masajista.darMasaje();
		System.out.println("-------------------");

	}

}
