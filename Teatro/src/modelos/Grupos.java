package modelos;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roter @version 1
 */
public class Grupos {
    private String semana;/** No puede ser 0,
                          da nombre al grupo en una 
                          determinada semana semana */

    public Grupos() {
    }

    public Grupos(String semana) {
        this.semana = semana;
    }
    public Grupos(Grupos g) {
        this.semana = g.getSemana();
    }
    @Override
    public String toString() {
        return "Grupos{" + "semana=" + semana + '}';
    }

    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }
}
