/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sklep_komputerowy;

import java.util.List;

/**
 *
 * @author student
 */
public class Magazyn extends Objekt_Bazodanowy{
    List<Produkt> Produkty;
    public Magazyn(int id, String nazwa) {
        super(id, nazwa);
    }
    
}
