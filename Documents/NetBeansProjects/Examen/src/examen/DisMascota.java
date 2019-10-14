/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author uriel
 */
public class DisMascota {
    int id;
    int horaDes;
    double cantDes;
    int horaCom;
    double cantCom;
    int horaCena;
    double cantCena;

    public DisMascota(int id, int horaDes, double cantDes, int horaCom, double cantCom, int horaCena, double cantCena) {
        this.id = id;
        this.horaDes = horaDes;
        this.cantDes = cantDes;
        this.horaCom = horaCom;
        this.cantCom = cantCom;
        this.horaCena = horaCena;
        this.cantCena = cantCena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHoraDes() {
        return horaDes;
    }

    public void setHoraDes(int horaDes) {
        this.horaDes = horaDes;
    }

    public double getCantDes() {
        return cantDes;
    }

    public void setCantDes(double cantDes) {
        this.cantDes = cantDes;
    }

    public int getHoraCom() {
        return horaCom;
    }

    public void setHoraCom(int horaCom) {
        this.horaCom = horaCom;
    }

    public double getCantCom() {
        return cantCom;
    }

    public void setCantCom(double cantCom) {
        this.cantCom = cantCom;
    }

    public int getHoraCena() {
        return horaCena;
    }

    public void setHoraCena(int horaCena) {
        this.horaCena = horaCena;
    }

    public double getCantCena() {
        return cantCena;
    }

    public void setCantCena(double cantCena) {
        this.cantCena = cantCena;
    }
    
    
    
}
