package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roter 
 * @version 1.0
 */
public class Limpieza {
    protected long id;
    public Limpieza() {
    }

    public Limpieza(long id) {
        this.id = id;
    }
    
     public Limpieza(Limpieza l) {
         this.id = l.getId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Limpieza{" + "id=" + id + '}';
    }

    
     public String data() {
    return  ""+getId();
    }
}
