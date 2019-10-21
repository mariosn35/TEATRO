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
public class Secretariado {
    protected long id;
    public Secretariado() {
        
    }

    public Secretariado(long id) {
        this.id = id;
    }
    
      public Secretariado(Secretariado s) {
        this.id = s.getId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Secretariado{" + "id=" + id + '}';
    }

   
     public String data() {
    return  ""+getId();
    }
}
