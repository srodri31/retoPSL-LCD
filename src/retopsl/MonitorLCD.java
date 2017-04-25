/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retopsl;

import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class MonitorLCD {
    
    ArrayList<NumeroLCD> numerosLCD;
    
    public MonitorLCD(ArrayList<NumeroLCD> numerosLCD){
        this.numerosLCD = numerosLCD;
    }
    
    public void printMonitor(){
        for(NumeroLCD numLCD: numerosLCD){
            char[][] matrizLCD = numLCD.getMatrizLCD();
            for(int i = 0; i < matrizLCD.length; i++){
                for(int j = 0; j < matrizLCD[0].length; j++){
                    System.out.print(matrizLCD[i][j]);
                }
                System.out.println("");
            }
            System.out.print("\n\n");
        }
    }
    
}
