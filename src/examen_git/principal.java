package examen_git;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {  
        Scanner l=new Scanner(System.in);
        utilidades util= new utilidades();
        int[]a=new int[5];
        int[]b=new int[5];
        System.out.println(""" 
                           MENU PRINCIPAL
                           1) A DIFERENCIA B
                           2) A SIMETRIA B
                           3) SALIR DEL PROGRAMA
                           """);
        int op=l.nextInt();
        switch(op){
            case 1:
                util.diferenciaAB(a, b);
                break;
            case 2:
                util.simetriaAB(a, b);
                break;
            case 3:
                System.out.println("Adios...");
                break;
            default:
        }
    }
    
    
}
