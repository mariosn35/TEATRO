package teatro;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roter
 */
public class Grupos {
    private String semana;

    public Grupos() {
    }

    public Grupos(String semana) {
        this.semana = semana;
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
