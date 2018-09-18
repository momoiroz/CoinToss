/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointoss;

import java.util.Random;

/**
 *
 * @author kamis
 */
//Step 1: Declare bla bla bla
public class Coin {
    protected boolean face;
    Random rand = new Random();

    public Coin() {
    }
    public void coinFlip()
    {
        face=rand.nextBoolean();
    }
    public boolean getFace()
    {
        return face;
    }

    @Override
    public String toString() {
        if (face) {
            return "Heads";
        } else {
            return "Tails";
        }
    }
    
}
