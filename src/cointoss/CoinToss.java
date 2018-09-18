/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointoss;

import java.util.Random;

//Step 3: test program
public class CoinToss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        SubCoin coinArray[] = new SubCoin[7];
        for (int i=0;i<7;i++)
        {
            coinArray[i]=new SubCoin(rand.nextInt(100)+1);
            coinArray[i].coinFlip();
        }
        int sum=0;
        for (int i=0;i<7;i++)
        {
            if (coinArray[i].getFace()) {
                sum+=coinArray[i].getValue();
            }
        }
        for (int i=0;i<7;i++)
        {
            System.out.print("Coin "+i+": ");
            System.out.println(coinArray[i].toString());
        }
        System.out.println("Sum = "+sum);
    }
    
}
