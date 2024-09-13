package actividad6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Agregar {
    public static String mensaje;
    
    public static void AgregarContacto(String[] infoContacto){
        try {
            String contacto, nombre;
            long numero;
            String nomContacto = infoContacto[0];
            long numContacto = Long.parseLong(infoContacto[1]);
            boolean existe = false;          
            File archivo = new File("Contactos.txt");
            
            if (archivo.exists() == false) {
                archivo.createNewFile();
            }
            
            RandomAccessFile raf = new RandomAccessFile(archivo, "rw");
            
            while (raf.getFilePointer() < raf.length()) {
                contacto = raf.readLine();
                String[] informacion = contacto.split("!");
                nombre = informacion[0];
                numero = Long.parseLong(informacion[1]);
                if (nombre.equals(nomContacto) || numero == numContacto) {
                    existe = true;
                    break;
                }
            }
            
            if (existe == false) {
                contacto = nomContacto + "!" + String.valueOf(numContacto);
                raf.writeBytes(contacto);
                raf.writeBytes(System.lineSeparator());
                mensaje = "\nContacto añadido.";
                raf.close();
            } else {
                raf.close();
                mensaje = "\nEl nombre o número del contacto ingresado ya existe.";
            } 
        } catch (IOException ioe) {
            mensaje = "\nError de entrada/salida\n" + ioe;
        } catch (NumberFormatException nef) {
            mensaje = "\nError de formato de número\n" + nef;
        }    
    }
}