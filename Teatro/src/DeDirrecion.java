/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roter
 */
public class DeDirrecion {
    private int añoscargo;

    public DeDirrecion() {
    }

    public DeDirrecion(int añoscargo) {
        this.añoscargo = añoscargo;
    }
    

    @Override
    public String toString() {
        return "DeDirrecion{" + "a\u00f1oscargo=" + añoscargo + '}';
    }

    public int getAñoscargo() {
        return añoscargo;
    }

    public void setAñoscargo(int añoscargo) {
        this.añoscargo = añoscargo;
    }
}
