/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;


public class Termostato {
    int id;
    String Temperatura;

    public Termostato(int id, String Temperatura) {
        this.id = id;
        this.Temperatura = Temperatura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(String Temperatura) {
        this.Temperatura = Temperatura;
    }
    
    
}
