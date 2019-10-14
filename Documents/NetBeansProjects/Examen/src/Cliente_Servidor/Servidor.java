/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente_Servidor;

import examen.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class Servidor {
    
    
    
    public static void main(String[] args)throws IOException{
        
        CrudUsuario Lista= new CrudUsuario();
        ListaUsuarios LU=null;
        FileInputStream archivo;
        ObjectInputStream Leer;
        File[] ficheros=null;
        ficheros[0]=new File("usuario");
        Usuario UR; 
        
    try{ 
         ArrayList<Usuario> U= new ArrayList<Usuario>();
         ObjectInputStream LeerArchivo= new ObjectInputStream(new FileInputStream("usuario"));
         U=(ArrayList)LeerArchivo.readObject();
         for (int i = 0; i <U.size(); i++) {
             UR=U.get(i);
             UR.muestraObjetosU();
         }
     }
     
     catch(Exception e){
     
     }
        
        
        
        
        try{
           boolean bandera=true;
           ServerSocket Servidor= new ServerSocket(9000);
           ObjectOutputStream Fsalida;
           ObjectInputStream Fentrada;
           ObjectOutputStream EscribirU;
           DataInputStream DIS;
           DataOutputStream DOS;
           FileOutputStream AUsuarios;
           System.out.println("iniciando servidor");
           
           
            while(bandera){
            
                Socket cl= Servidor.accept();
                
                
                Fentrada= new ObjectInputStream(cl.getInputStream());
                Fsalida= new ObjectOutputStream(cl.getOutputStream());
                DIS= new DataInputStream(cl.getInputStream());
                DOS= new DataOutputStream(cl.getOutputStream());
                
               
                
              
                
                
                    
                
            
                     
                                            
                                            
                                       
                                    
                                  
                                
                        
                    
        
            }
        }
        
        catch(Exception e){
            
        }
        
        
    }
}
