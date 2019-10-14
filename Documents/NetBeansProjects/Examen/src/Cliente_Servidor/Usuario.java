/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente_Servidor;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.ListIterator;


public class Usuario implements Serializable {
    
    int idclase;
    int id;
    String user;
    String Nombre;
    String pwd;
    String TipoUsuario;

    public Usuario(int id, String user, String Nombre, String pwd, String TipoUsuario) {
        this.idclase=0;
        this.id = id;
        this.user = user;
        this.Nombre = Nombre;
        this.pwd = pwd;
        this.TipoUsuario = TipoUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    public void muestraObjetosU(){
        System.out.println(" Usuario clase: "+ idclase+ "id= "+id+", user= "+user+", nombre=  "
                +Nombre+" pwd= "+pwd+" tipoUsuario= "+TipoUsuario);
    }
    
}  


class ListaUsuarios implements Serializable{
 
    LinkedList lista = new LinkedList();
    int valor;
    
      ListaUsuarios(int tamano,int[] id, String[] user, String[] nombre,String[]pwd,String[]tipoUsuario){
        for(int i =0; i < tamano; i++)
            lista.add(new Usuario(id[i],user[i],nombre[i],pwd[i],tipoUsuario[i]));
    }
      ListaUsuarios(int tamano, Usuario[] U){
        for(int i=0; i<tamano;i++)
            lista.add(U[i]);
    }
     
    public int getTamano(){
        return lista.size();
    }
    
    public Usuario getObjeto(int i){
        return (Usuario)lista.get(i);
    }
    
    public void muestraObjetosL(){
        ListIterator li = lista.listIterator();
        Usuario o1;
        
        System.out.println("Usuario["+lista.size()+"]=");
        while(li.hasNext()){
            o1 = (Usuario) li.next();
            o1.muestraObjetosU();
        }
    }

}
    
