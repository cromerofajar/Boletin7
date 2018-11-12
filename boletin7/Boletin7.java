
package boletin7;

/**
 *
 * @author cromerofajar
 */
public class Boletin7 {

    public static void main(String[] args) {
        Libro obx1=new Libro();
        obx1.introduzcaAutor();
        obx1.introduzcaPrestados();
        obx1.introduzcaLibros();
        obx1.introduzcaExemplares();
        obx1.prestamo();
        obx1.devolucion();
        System.out.println(obx1.toString());
        
    }
    
}
