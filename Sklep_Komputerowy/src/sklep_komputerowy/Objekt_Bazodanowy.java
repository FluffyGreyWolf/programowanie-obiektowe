/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sklep_komputerowy;

/**
 *
 * @author student
 */
public abstract class Objekt_Bazodanowy {
    private int id;
    private String nazwa;

    public Objekt_Bazodanowy(int id, String nazwa) {
        this.id = id;
        this.nazwa = nazwa;
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }
}
