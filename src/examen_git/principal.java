package examen_git;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        
        Scanner l=new Scanner(System.in);
        utilidades util= new utilidades();
        int[]a=new int[5];
        int[]b=new int[5];
        for (int i = 0; i <a.length; i++) {
            System.out.println("Ingrese un valor para a");
            a[i]=l.nextInt();
            System.out.println("Ingrese un valor para b");
            b[i]=l.nextInt();
        }
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
            case 2:
            case 3:
            default:
        }
    }
    
    
}
