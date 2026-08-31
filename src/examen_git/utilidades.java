package examen_git;

import java.util.Scanner;

public class utilidades {
    public void imprimir(int[] a,int[] b){
        System.out.println("los datos del conjunto A son:");
        for (int i = 0; i <a.length; i++) {
            System.out.print(" "+a[i]);
        }
        System.out.println("Los datos del conjunto B son:");
        for (int i = 0; i <b.length; i++) {
            System.out.print(" "+b[i]);
        }
    }
    public void diferenciaAB(int []a, int[] b){
        int cont=0;
        int insercion=0;
        int rep=0;
        for (int i = 0; i < a.length; i++) {
            rep=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[j]) {
                    rep=rep+1;
                }
            }
            if (rep==0) {
            cont=cont+1;
            }
        }
        int[] dif=new int[cont];
        for (int i = 0; i < a.length; i++) {
            rep=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[j]) {
                    rep=rep+1;
                }
            }
            if (rep==0) {
                if (insercion<cont) {
                dif[insercion]=a[i];
                insercion=insercion+1;
                }
            }
        }
        System.out.println("los datos de la diferencia A B son");
        for (int i = 0; i < dif.length; i++) {
            System.out.print(" "+dif[i]);
        }
    }
    public void simetriaAB(int[]a,int[]b){
        int cont=0;
        int simetria=0;
        int rep=0;
        for (int i = 0; i < a.length; i++) {
            rep=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[j]) {
                    rep=rep+1;
                }
            }
            if (rep==0) {
            cont=cont+2;
            }
        }
        int[] sim=new int[cont];
        for (int i = 0; i < a.length; i++) {
            rep=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[j]) {
                    rep=rep+1;
                }
            }
            if (rep==0) {
                if (simetria<cont) {
                sim[simetria]=a[i];
                simetria=simetria+1;
                
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            rep=0;
            for (int j = 0; j < a.length; j++) {
                if (a[j]==b[i]) {
                    rep=rep+1;
                }
            }
            if (rep==0) {
                if (simetria<cont) {
                sim[simetria]=b[i];
                simetria=simetria+1;
                }
            }
        }
        System.out.println("los datos de la simetria son: ");
        for (int i = 0; i < sim.length; i++) {
            System.out.print(" "+sim[i]);
        }
    }
    public void duplicado(int[]a,int[]b){
        Scanner l=new Scanner(System.in);
         System.out.println("Ingrese los datos del conjunto a");
                for (int i = 0; i < a.length; i++) {
                    a[i]=l.nextInt();
                }
        int rep=0;
        int cont=0;
        do {
            rep=0;
            for (int i = 0; i < a.length; i++) {
            cont=cont+1;
            for (int j = cont; j < a.length; j++) {
                if (a[i]==a[j]) {
                    System.out.println("Se ha encontrado un duplicado ingrese un nuevo valor en el conjunto a");
                    System.out.println("El valor duplicado es: "+a[j]+" hallado en la posicion "+ (j+1));
                    a[j]=l.nextInt();
                    rep=rep+1;
                }
               
            }
            
        }
        } while (rep!=0);
        System.out.println("Ingrese los datos del conjunto b");
        for (int i = 0; i < b.length; i++) {
            b[i]=l.nextInt();
        }
        cont=0;
        do {
            rep=0;
            for (int i = 0; i < b.length; i++) {
                cont=cont+1;
            for (int j = cont; j < b.length; j++) {
                if (b[i]==b[j]) {
                    System.out.println("Se ha encontrado un duplicado ingrese un nuevo valor en el conjunto b");
                    System.out.println("El valor duplicado es: "+b[j]+" hallado en la posicion "+ (j+1));
                    b[j]=l.nextInt();
                    rep=rep+1;
                }
            }
        }
        } while (rep!=0);
        
        }
}
