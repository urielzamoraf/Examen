/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
}*/
package Cliente_Servidor;


import java.io.FileInputStream;
import java.io.ObjectInputStream;
import examen.*;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import static jdk.nashorn.internal.parser.TokenType.EOF;


public class leertxt {
     public static void main(String[] args) throws FileNotFoundException {
        String cadena;
        
        ArrayList<Usuario> lista= new ArrayList<Usuario>();
        FileInputStream  FIS;
        ObjectInputStream OIS;
        Usuario UR;
        try{
            FIS= new FileInputStream("usuario"); 
            OIS=new ObjectInputStream(FIS);
             
             ArrayList<Usuario> U= new ArrayList<Usuario>();
         ObjectInputStream LeerArchivo= new ObjectInputStream(new FileInputStream("usuario"));
         U=(ArrayList)LeerArchivo.readObject();
         for (int i = 0; i <U.size(); i++) {
             UR=U.get(i);
             UR.muestraObjetosU();
         }        
         }
             
         catch(Exception e){
         e.printStackTrace();
         }
         
         
    }
}
