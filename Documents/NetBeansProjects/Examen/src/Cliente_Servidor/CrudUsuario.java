/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente_Servidor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class CrudUsuario {
    
    public void  agregarUsuario( Usuario Usu){
    try{
        
        ArrayList <Usuario> U= new ArrayList<Usuario>();
        ObjectInputStream LeerArchivo= new ObjectInputStream(new FileInputStream("usuario"));
        U=(ArrayList<Usuario>)LeerArchivo.readObject();
        
        U.add(Usu);
        
        ObjectOutputStream escribirArchivo= new ObjectOutputStream(new FileOutputStream("usuario"));
        escribirArchivo.writeObject(U);
        
        }
    
    catch(Exception e){
    }
    
    }
    
    public Usuario consultasUsuario(int id){
    Usuario UR=null; 
    try{ 
         ArrayList <Usuario> U= new ArrayList<Usuario>();
         ObjectInputStream LeerArchivo= new ObjectInputStream(new FileInputStream("usuario"));
         U=(ArrayList<Usuario>)LeerArchivo.readObject();

         UR= U.get(id);
         
     }
     
     catch(Exception e){
     
     }
        
    return UR;  
    }
    
    public void eliminarUsuario(int id){
        Usuario EU;
        try{
            ArrayList<Usuario> U=new ArrayList<Usuario>();
            ObjectInputStream LeerArchivo= new ObjectInputStream(new FileInputStream("usuario"));
            U=(ArrayList<Usuario>)LeerArchivo.readObject();
            U.remove(id);
            ObjectOutputStream escribirArchivo= new ObjectOutputStream(new FileOutputStream("usuario"));
            escribirArchivo.writeObject(U);
        }
        catch(Exception e){
        
        }
    }
    
    public void modificarUsuario(int id){
        
        
    }
    
}
