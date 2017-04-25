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
public class NumeroLCD {
    
    private char[][] matrizLCD;
    private int[] digits;
    private int size;
    
    public NumeroLCD(){}
    
    public NumeroLCD(int[] digits, int size) {
        this.digits = digits;
        this.size = size;
        inicializarMatriz(this.digits, size);
        digitToLCD(digits);
    }   
    
    private void inicializarMatriz(int[] digits, int size){
        int lenght = digits.length;
        int sizeDigito = size + 3;
        int cols = sizeDigito*lenght;
        int filas = 2 * size + 3;
        
        matrizLCD = new char[filas][cols];
        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < cols; j++){
                matrizLCD[i][j] = ' ';
            }
        }
    }
    
    private void digitToLCD(int[] digits){
        for(int i = 0; i < digits.length; i++){
            switch(digits[i]){
                case 0:
                    zeroToLCD(i*(size + 3), size);
                    break;
                case 1:
                    oneToLCD(i*(size + 3), size);
                    break;
                case 2:
                    twoToLCD(i*(size + 3), size);
                    break;
                case 3:
                    threeToLCD(i*(size + 3), size);
                    break;
                case 4:
                    fourToLCD(i*(size + 3), size);
                    break;
                case 5:
                    fiveToLCD(i*(size + 3), size);
                    break;
                case 6:
                    sixToLCD(i*(size + 3), size);
                    break;
                case 7:
                    sevenToLCD(i*(size + 3), size);
                    break;
                case 8:
                    eightToLCD(i*(size + 3), size);
                    break;
                case 9:
                    nineToLCD(i*(size + 3), size);
                    break;  
            }
        }
    }
    
    private void zeroToLCD(int col, int size){
        //horizontales
        for(int i = col+2; i < size+col+2; i++ ){
            matrizLCD[0][i]='-'; //arriba
            matrizLCD[2*(size+1)][i]='-'; //abajo
        }
        //verticales
        for(int i = 0; i < size; i++ ){
            matrizLCD[i+1][col+1]='|'; //izquierda arriba
            matrizLCD[i+1][col+size+2]='|'; //derecha arriba
            matrizLCD[i+size+2][col+size+2]='|'; //derecha abajo
            matrizLCD[i+size+2][col+1]='|'; //izquierda abajo
        }
    }
    
    private void oneToLCD(int col, int size){
        //verticales
        for(int i = 0; i < size; i++ ){
            matrizLCD[i+1][col+size+2]='|'; //derecha arriba
            matrizLCD[i+size+2][col+size+2]='|'; //derecha abajo
        }
    }
    
    private void twoToLCD(int col, int size){
        for(int i = col+2; i < size+col+2; i++ ){
            matrizLCD[0][i]='-';
            matrizLCD[size+1][i]='-';
            matrizLCD[2*(size+1)][i]='-';
        }
        for(int i = 0; i < size; i++ ){
            matrizLCD[i+1][col+size+2]='|';
            matrizLCD[i+size+2][col+1]='|';
        }
    }
    
    private void threeToLCD(int col, int size){
        for(int i = col+2; i < size+col+2; i++ ){
            matrizLCD[0][i]='-';
            matrizLCD[size+1][i]='-';
            matrizLCD[2*(size+1)][i]='-';
        }
        for(int i = 0; i < size; i++ ){
            matrizLCD[i+1][col+size+2]='|'; //derecha arriba
            matrizLCD[i+size+2][col+size+2]='|'; //derecha abajo
        }   
    }
    
    private void fourToLCD(int col, int size){
        for(int i = col+2; i < size+col+2; i++ ){
            matrizLCD[size+1][i]='-';
        }
        
        for(int i = 0; i < size; i++ ){
            matrizLCD[i+1][col+1]='|';
            matrizLCD[i+1][col+size+2]='|'; //derecha arriba
            matrizLCD[i+size+2][col+size+2]='|'; //derecha abajo
        }
    }
    
    private void fiveToLCD(int col, int size){
        for(int i = col+2; i < size+col+2; i++ ){
            matrizLCD[0][i]='-';
            matrizLCD[size+1][i]='-';
            matrizLCD[2*(size+1)][i]='-';
        }
        for(int i = 0; i < size; i++ ){
            matrizLCD[i+1][col+1]='|';
            matrizLCD[i+size+2][col+size+2]='|';
        }
    }
    
    private void sixToLCD(int col, int size){
        for(int i = col+2; i < size+col+2; i++ ){
            matrizLCD[0][i]='-';
            matrizLCD[size+1][i]='-';
            matrizLCD[2*(size+1)][i]='-';
        }
        for(int i = 0; i < size; i++ ){
            matrizLCD[i+1][col+1]='|';
            matrizLCD[i+size+2][col+size+2]='|';
            matrizLCD[i+size+2][col+1]='|';
        }
    }
    
    private void sevenToLCD(int col, int size){
        for(int i = col+2; i < size+col+2; i++ ){
            matrizLCD[0][i]='-';
        }
 
        for(int i = 0; i < size; i++ ){
            matrizLCD[i+1][col+size+2]='|'; //derecha arriba
            matrizLCD[i+size+2][col+size+2]='|'; //derecha abajo
        }
    }
    
    private void eightToLCD(int col, int size){
        //horizontales
        for(int i = col+2; i < size+col+2; i++ ){
            matrizLCD[0][i]='-'; //arriba
            matrizLCD[size+1][i]='-'; //medio
            matrizLCD[2*(size+1)][i]='-'; //abajo
        }
        //verticales
        for(int i = 0; i < size; i++ ){
            matrizLCD[i+1][col+1]='|'; //izquierda arriba
            matrizLCD[i+1][col+size+2]='|'; //derecha arriba
            matrizLCD[i+size+2][col+size+2]='|'; //derecha abajo
            matrizLCD[i+size+2][col+1]='|'; //izquierda abajo
        }
    }
    
    private void nineToLCD(int col, int size){
        //horizontales
        for(int i = col+2; i < size+col+2; i++ ){
            matrizLCD[0][i]='-'; //arriba
            matrizLCD[size+1][i]='-'; //medio
            matrizLCD[2*(size+1)][i]='-'; //abajo
        }
        //verticales
        for(int i = 0; i < size; i++ ){
            matrizLCD[i+1][col+1]='|'; //izquierda arriba
            matrizLCD[i+1][col+size+2]='|'; //derecha arriba
            matrizLCD[i+size+2][col+size+2]='|'; //derecha abajo
        }
    }
    
    public char[][] getMatrizLCD(){
        return this.matrizLCD;
    }
    
}
