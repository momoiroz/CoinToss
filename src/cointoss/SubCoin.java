/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointoss;
//Step 2: Declare subclass of coin
public class SubCoin extends Coin{
    private int value;

    public SubCoin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
       String retValue ="face: ";
       if (face) 
       {
           retValue+="Heads";
       } else {
           retValue+="Tails";
       }
       retValue+= ". Value=";
       retValue+=value+"";
       return retValue;
    }
    
}
