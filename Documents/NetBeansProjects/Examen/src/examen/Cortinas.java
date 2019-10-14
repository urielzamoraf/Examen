/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Date;


public class Cortinas {
    
    int id;
    String ubicacion;
    String posicion;
    Date horaAper;
    Date horaCierre;

    public Cortinas(int id, String ubicacion, String posicion, Date horaAper, Date horaCierre) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.posicion = posicion;
        this.horaAper = horaAper;
        this.horaCierre = horaCierre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Date getHoraAper() {
        return horaAper;
    }

    public void setHoraAper(Date horaAper) {
        this.horaAper = horaAper;
    }

    public Date getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(Date horaCierre) {
        this.horaCierre = horaCierre;
    }
    
    
    
}
