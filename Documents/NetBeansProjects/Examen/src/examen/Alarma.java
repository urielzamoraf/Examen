/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.ListIterator;


public class Alarma implements Serializable {
   
    int id;
    String horaInicio;
    String horaTermino;
    boolean estado;

    public Alarma(int id, String horaInicio, String horaTermino, boolean estado) {
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(String horaTermino) {
        this.horaTermino = horaTermino;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void mostrarObjeto(){
        System.out.println("id:"+id+"hora inicio: "+horaInicio+"hora Termino: "+horaTermino+"estado: "+estado);
    }
    
    
}

class ListaAlarma implements Serializable{

    private LinkedList lista = new LinkedList();
    int valor;
    
    public ListaAlarma(int tamano,int []id, String [] horaInicio, String[] horaTermino, boolean []estado) {
            for(int i=0;i<tamano;i++){
                lista.add(new Alarma(id[i],horaInicio[i],horaTermino[i],estado[i]));
            }
    }
    
    public int gettamano(){
        return lista.size();
    } 
    
    public Alarma getObejto(int i){
        return (Alarma)lista.get(i);
    }
    
    public void mostrarObjeto(){
        ListIterator LI= lista.listIterator();
        Alarma OL;
        
        while(LI.hasNext()){
            OL=(Alarma)(LI.next());
            OL.mostrarObjeto();
                    
        }
    
    }
    


}