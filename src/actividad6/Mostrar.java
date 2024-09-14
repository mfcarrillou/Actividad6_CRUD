package actividad6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Mostrar {
    public static String mensaje;
    
    public static void MostrarContactos(){
        try {
            String contacto, nombre;
            long numero;
            mensaje = "";
            File archivo = new File("Contactos.txt");

            if (archivo.exists()&& archivo.length() != 0){
                RandomAccessFile raf = new RandomAccessFile(archivo, "rw");

                while (raf.getFilePointer() < raf.length()) {
                    contacto = raf.readLine();
                    String[] informacion = contacto.split("!");
                    nombre = informacion[0];
                    numero = Long.parseLong(informacion[1]);
                    mensaje += "\nNombre del contacto: " + nombre + ".\n" + "Número del contacto: " + numero + ".\n";
                }
                
                raf.close();
            } else {
                mensaje = "\nNo hay contactos disponibles.";
            } 
        } catch (IOException ioe) {
            mensaje = "\nError de entrada/salida\n" + ioe;
        } catch (NumberFormatException nef) {
            mensaje = "\nError de formato de número\n" + nef;
        }    
    }
}