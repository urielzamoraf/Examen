/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;


public class Irrigador {
    
    int id;
    int horaRiego;
    int tiempRiego;

    public Irrigador(int id, int horaRiego, int tiempRiego) {
        this.id = id;
        this.horaRiego = horaRiego;
        this.tiempRiego = tiempRiego;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHoraRiego() {
        return horaRiego;
    }

    public void setHoraRiego(int horaRiego) {
        this.horaRiego = horaRiego;
    }

    public int getTiempRiego() {
        return tiempRiego;
    }

    public void setTiempRiego(int tiempRiego) {
        this.tiempRiego = tiempRiego;
    }
    
    
}
