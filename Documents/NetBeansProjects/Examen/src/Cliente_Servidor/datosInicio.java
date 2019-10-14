/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente_Servidor;
//import examen.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class datosInicio {
    
    public static void main(String[] args) {
        FileOutputStream FOS;
        ObjectOutputStream OOS;
        
       try{
        
        ArrayList <Usuario> U= new ArrayList<Usuario>();
        //ObjectInputStream LeerArchivo= new ObjectInputStream(new FileInputStream("usuario"));
        //U=(ArrayList<Usuario>)LeerArchivo.readObject();
        Usuario nuevo=new Usuario(0,"uriel","uriel zamora","1234","admin");
        U.add(nuevo);
        
        ObjectOutputStream escribirArchivo= new ObjectOutputStream(new FileOutputStream(new File("usuario")));
        escribirArchivo.writeObject(U);
        escribirArchivo.flush();
        
        }
    
    catch(Exception e){
    }
    
        
    }
}


