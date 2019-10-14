/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.Serializable;


public class Refrigerador implements Serializable {
    
    int id;
    int tmFrigo;
    int temCentro;
    int temCharola;

    public Refrigerador(int id, int tmFrigo, int temCentro, int temCharola) {
        this.id = id;
        this.tmFrigo = tmFrigo;
        this.temCentro = temCentro;
        this.temCharola = temCharola;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTmFrigo() {
        return tmFrigo;
    }

    public void setTmFrigo(int tmFrigo) {
        this.tmFrigo = tmFrigo;
    }

    public int getTemCentro() {
        return temCentro;
    }

    public void setTemCentro(int temCentro) {
        this.temCentro = temCentro;
    }

    public int getTemCharola() {
        return temCharola;
    }

    public void setTemCharola(int temCharola) {
        this.temCharola = temCharola;
    }
    
    
}
