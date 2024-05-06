package ctof;

import java.util.Scanner;

public class CtoF {    
    public static void main(String[] args) {
        System.out.println("Digite uma temp em graus C");
        Scanner sc = new Scanner(System.in);
        double tempC = sc.nextDouble();
        System.out.println("A temperatura em F é: " 
                + ((tempC * 1.8) + 32));
    }    
}
