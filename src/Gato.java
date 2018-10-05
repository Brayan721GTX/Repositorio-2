
public class Gato {
    
    String nombre = "Misha";
    
    void dormir() {
        System.out.println("El gato duerme");
    }
    
    void maullar() {
        System.out.println("Maullar");
    }

    void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    void mostrarNombre() {
        System.out.println(nombre);
    }
    
}
