package examen_git;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {  
        Scanner l=new Scanner(System.in);
        utilidades util= new utilidades();
         int op=0;
        int[]a=new int[5];
        int[]b=new int[5];
        int r=0;
        do {
            System.out.println(""" 
                           MENU PRINCIPAL
                           1) LLENADO DE CONJUNTOS
                           2) A DIFERENCIA B
                           3) A SIMETRIA B
                           4) SALIR DEL PROGRAMA
                           """);
        op=l.nextInt();
        switch(op){
            case 1:
                if (r==0) {
                    util.duplicado(a, b);
                    r=r+1;
                }else{
                    System.out.println("Ya se han llenado los conjuntos");
                }
                break;
            case 2:
                util.diferenciaAB(a, b);
                break;
            case 3:
                util.simetriaAB(a, b);
                break;
            case 4:
                System.out.println("Adios...");
                break;
            default:
        }
        } while (op!=4);
    }
    
    
}
