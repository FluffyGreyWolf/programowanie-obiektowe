/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfejsy;

/**
 *
 * @author student
 */
public class Interfejsy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               MyList ml = MyList(9);
        ml.add(5);
        ml.add(3);
        ml.add(8);
        ml.add(2);
        ml.add(15);
        ml.add(9);
        System.out.println(ml);
        ml.sort();
        System.out.println(ml);
    }
    
}
