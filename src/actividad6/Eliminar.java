package actividad6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Eliminar {
    public static String mensaje;
    
    public static void EliminarContacto(String nomContacto) {
        try {
            String contacto, nombre;
            long numero;
            int index;
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
                if (nombre.equals(nomContacto)) {
                    existe = true;
                    break;
                }
            }

            if (existe) {
                File archTemp = new File("temp.txt");
                RandomAccessFile rafTemp = new RandomAccessFile(archTemp, "rw");
                raf.seek(0);
                
                while (raf.getFilePointer() < raf.length()) {
                    contacto = raf.readLine();
                    index = contacto.indexOf("!");
                    nombre = contacto.substring(0, index);

                    if (nombre.equals(nomContacto)) {
                        continue;
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
                mensaje = "\nContacto eliminado.";
            } else {
                raf.close();
                mensaje = "\nEl contacto no existe.";
            }
        } catch (IOException ioe) {
            mensaje = "\nError de entrada/salida\n" + ioe;
        }
    }
}