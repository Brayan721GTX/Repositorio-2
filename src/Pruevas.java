
public class Pruevas {
    
    public static void main(String[] args) {
        Gato gato1 = new Gato();
        gato1.cambiarNombre("Dori");
        gato1.mostrarNombre();
        
        Gato gato2 = new Gato();
        gato2.mostrarNombre();
    }
    
    void saludar() {
        System.out.println("Hola");
    }
    
    void comprar ( ) {
        System.out.println("Milanesa de pollo");
    }
}
