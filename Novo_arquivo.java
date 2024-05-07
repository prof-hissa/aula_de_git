package ctof;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CtoF {    
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("###,##0.##");
        System.out.println("Digite uma temperatura em graus ºC");
        System.out.print("Temperatura: ");        
        Scanner sc = new Scanner(System.in);        
        double tempC = sc.nextDouble();
        System.out.println("______________________________");
        System.out.println("");
        System.out.println("A temperatura em ºF é: " 
                + df.format((tempC * 1.8) + 32)+"ºF");
        System.out.println("");        
    }    
}
