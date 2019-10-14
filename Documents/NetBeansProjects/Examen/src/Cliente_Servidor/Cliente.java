
package Cliente_Servidor;

import examen.*;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;




public class Cliente {
    
    public static void main(String[] args)throws IOException {
        ObjectOutputStream Fsalida=null;
        ObjectInputStream Fentrada=null;
        DataInputStream Edatos=null;
        DataOutputStream Sdatos=null;
        Scanner entrada= new Scanner(System.in);
        CrudUsuario Arreglo= new CrudUsuario();
        
        try{
            boolean bandera=true; 
            int control=0;
            int puerto=9000;
            String host="localhost";
            Socket cl= new Socket(host,puerto);
            Fsalida= new ObjectOutputStream(cl.getOutputStream());
            Fentrada= new ObjectInputStream(cl.getInputStream());
            Sdatos=new DataOutputStream(cl.getOutputStream());
            Edatos= new DataInputStream(cl.getInputStream());
            
                
            
                
                            System.out.println("introduce el id");
                            int id=entrada.nextInt();
                            System.out.println("introduce el user");
                            String Nusuario=entrada.nextLine();
                            System.out.println("introduce el nombre");
                            String nombre=entrada.nextLine();
                            System.out.println("introduce el pwd");
                            String pwd= entrada.nextLine();
                            System.out.println("tipo usuario");
                            String tipoU=entrada.nextLine();
                            
                            Usuario U=new Usuario(id,Nusuario,nombre,pwd,tipoU);
                            
                            Fsalida.writeObject(U);
                            Fsalida.close();
                                                   
        }
        
       catch(Exception e){
           
       }
        
        
    }
}
