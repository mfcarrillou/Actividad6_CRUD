package actividad6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Actualizar {
    public static String mensaje;
    
    public static void ActualizarContacto(String[] infoContacto){
        try {
            String contacto, nombre;
            long numero;
            int index;
            boolean existe = false;
            String nomContacto = infoContacto[0];
            long numContacto = Long.parseLong(infoContacto[1]);
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
                if (nombre.equals(nomContacto)) {
                    existe = true;
                    break;
                }
            }
            
            if (existe) {
                File archTemp = new File("Temp.txt");
                RandomAccessFile rafTemp= new RandomAccessFile(archTemp, "rw");
                raf.seek(0);
                
                while (raf.getFilePointer() < raf.length()) {
                    contacto = raf.readLine();
                    index = contacto.indexOf("!");
                    nombre = contacto.substring(0, index);
                    if (nombre.equals(nomContacto)) {
                        contacto = nombre + "!" + String.valueOf(numContacto);
                    }
                    rafTemp.writeBytes(contacto);
                    rafTemp.writeBytes(System.lineSeparator());
                }
                
                raf.seek(0);
                raf.setLength(0);
                rafTemp.seek(0);
                                
                while (rafTemp.getFilePointer() < rafTemp.length()) {
                    raf.writeBytes(rafTemp.readLine());
                    raf.writeBytes(System.lineSeparator());
                }
                
                rafTemp.close();
                raf.close();
                archTemp.delete();
                mensaje = "\nContacto actualizado.";
            } else {
                raf.close();
                mensaje = "\nEl contacto no existe.";
            }   
        } catch (IOException ioe) {
            mensaje = "\nError de entrada/salida\n" + ioe;
        } catch (NumberFormatException nef) {
            mensaje = "\nError de formato de número\n" + nef;
        }    
    }  
}
