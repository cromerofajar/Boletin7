
package boletin7;

import java.util.Scanner;

/**
 *
 * @author cromerofajar
 */
public class Libro {
    private String tituloLibro;
    private String autor;
    private int nExemplares;
    private int nPrestados;
    public Libro(){};
    public Libro(String tlibro, String auto, int nExem, int nPres){
        tituloLibro=tlibro;
        autor=auto;
        nExemplares=nExem;
        nPrestados=nPres;
    }
    Scanner ler=new Scanner(System.in);
    public void getLibros(){
        String libro;
        System.out.println("Introduzca titulo do libro:");
        libro=ler.next();
        tituloLibro=libro;
    }
    public String setLibro(){
        return tituloLibro;
    }
    public void getAutor(){
        String autor;
        System.out.println("Introduzca autor do libro:");
        autor=ler.nextLine();
        this.autor=autor;
    }
    public String setAutor(){
        return autor;
    }
    public void getExemplares(){
        int exempla;
        System.out.println("Introduzca numero exemplares do libro:");
        exempla=ler.nextInt();
        nExemplares=exempla;
    }
    public int setExemplares(){
        return nExemplares;
    }
    public void getPrestados(){
        int prest;
        System.out.println("Introduzca numero prestamos do libro:");
        prest=ler.nextInt();
        nPrestados=prest;
    }
    public int setPrestados(){
        return nPrestados;
    }
    public void prestamo(){
        int prest;
        System.out.println("Introduzca libros a prestar:");
        prest=ler.nextInt();
        nExemplares=nExemplares-prest;
        if(nExemplares<=0){
            System.out.println("False");
            nExemplares=nExemplares+prest;
        }
        else{
            System.out.println("True");
            nPrestados=nPrestados+prest;
        }
    }
    public void devolucion(){
        int dev;
        System.out.println("Introduzca libros a prestar:");
        dev=ler.nextInt();
        nPrestados=nPrestados-dev;
        if(nPrestados<=0){
            System.out.println("False");
            nPrestados=nPrestados+dev;
        }
        else{
            System.out.println("True");
            nExemplares=nExemplares+dev;

        }
    }
    public String toString(){String datosLibro="Titulo: "+ tituloLibro+"\nAutor: "+ autor +"\nExemplares: "+nExemplares+"\nPrestamos: "+nPrestados; return datosLibro;}
}
