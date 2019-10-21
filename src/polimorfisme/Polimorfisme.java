/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author Tutor 01
 */

public class Polimorfisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kataTes;
        Mamalia[] m = new Mamalia[3];
        m[0] = new Mamalia();
        m[1] = new Kucing();
        m[2] = new Harimau();
        
        for(int i=0; i<3; i++){
            kataTes = m[i].bersuara();
            System.out.println("Suara " + i + " : " + kataTes);
        }
    }
    
}
