/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retopsl;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class CommandReader {

    private final Scanner sc;
    private int digits[];
    private static final String endCommand = "0,0";
    private ArrayList<NumeroLCD> numeros;
    private final IntegerUtils intUtils = new IntegerUtils();
    private MonitorLCD monitor;

    public CommandReader() {
        sc = new Scanner(System.in);
        numeros = new ArrayList<>();
        readCommand();
    }

    private void readCommand() {
        String command = "";
        do {
            System.out.print("monitorLCD>");
            command = sc.nextLine();
            exec(command);
        } while (!command.equals(endCommand));
        monitor = new MonitorLCD(numeros);
        monitor.printMonitor();
    }

    private void exec(String command) {
        int[] params;
        try {
            params = parseCommand(command);
            NumeroLCD nLCD = createLCDNumber(params);
            numeros.add(nLCD);
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }
    }

    private NumeroLCD createLCDNumber(int[] params) {
        int size = params[0];
        int numero = params[1];
        digits = intUtils.intToArray(numero);
        NumeroLCD numLCD = new NumeroLCD(digits, size);
        return numLCD;
    }

    private int[] parseCommand(String command) throws IllegalArgumentException {
        String[] params;

        int tam;
        int numero;

        if (!command.contains(",")) {
            throw new IllegalArgumentException("Cadena " + command
                    + " no contiene caracter ,");
        }

        //Se hace el split de la cadena
        params = command.split(",");

        //Valida la cantidad de params
        if (params.length > 2) {
            throw new IllegalArgumentException("Cadena " + command
                    + " contiene más argumentos de los permitidos");
        }

        //Valida la cantidad de params
        if (params.length < 2) {
            throw new IllegalArgumentException("Cadena " + command
                    + " no contiene los parametros requeridos");
        }

        //Valida que el parametro size sea un numerico
        if (isNumeric(params[0])) {
            tam = Integer.parseInt(params[0]);

            // se valida que el size este entre 1 y 10
            if (tam < 1 || tam > 10) {
                throw new IllegalArgumentException("El parametro size [" + tam
                        + "] debe estar entre 1 y 10");
            }
        } else {
            throw new IllegalArgumentException("Parametro size [" + params[0]
                    + "] no es un número");
        }

        //Valida que el parametro número sea un numerico
        if (isNumeric(params[1])) {
            numero = Integer.parseInt(params[1]);
        } else {
            throw new IllegalArgumentException("Parametro número [" + params[1]
                    + "] no es un número");
        }

        int[] paramsInt = {tam, numero};

        return paramsInt;

    }

    static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
