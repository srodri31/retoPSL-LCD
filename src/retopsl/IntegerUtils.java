/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retopsl;

/**
 *
 * @author Santiago
 */
public class IntegerUtils {
    
    public IntegerUtils(){}
    
    public int[] intToArray(int numero){
        String temp = Integer.toString(numero);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            digits[i] = temp.charAt(i) - '0';
        }
        return digits;
    }
}
