
package boletin7;

/**
 *
 * @author cromerofajar
 */
public class Boletin7 {

    public static void main(String[] args) {
        Libro obx1=new Libro();
        obx1.getAutor();
        obx1.getPrestados();
        obx1.getLibros();
        obx1.getExemplares();
        obx1.prestamo();
        obx1.devolucion();
        System.out.println(obx1.toString());
        
    }
    
}
