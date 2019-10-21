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
class Mamalia{
    protected int cacahKaki;
    public String bersuara(){
        return("bersuara");
    }
}

class Kucing extends Mamalia{
    protected int cacahKaki;
    
    @Override
    public String bersuara(){
        return("Meooong ...");
    }
}

class Harimau extends Mamalia{
    protected int cacahKaki;
    
    @Override
    public String bersuara(){
        return("Auuumhgrrrr ...");
    }
}
