import java.util.HashSet;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var array = RandomUtilities.generarRandomArrayInt(30, 2000, 1, new Random());
        final var setNumeros = new HashSet<Integer>();

        for (var elemento : array) {
            if (elemento % 10 == 0) {
                setNumeros.add(elemento);
            }
        }
        System.out.printf("El set de numeros es: %s%n", setNumeros);
    }
}
