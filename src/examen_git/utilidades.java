package examen_git;
public class utilidades {
    public void imprimir(int[] a,int[] b){
        System.out.println("los datos del conjunto A son:");
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Los datos del conjunto B son:");
        for (int i = 0; i <b.length; i++) {
            System.out.println(b[i]);
        }
    }
    public void diferenciaAB(int []a, int[] b){
        int cont=0;
        int insercion=0;
        int rep=0;
        for (int i = 0; i < a.length; i++) {
            rep=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[i]) {
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
                if (a[i]==b[i]) {
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
            System.out.println(dif[i]);
        }
    }
    public void simetriaAB(int[]a,int[]b){
        int cont=0;
        int simetria=0;
        int rep=0;
        int bs=0;
        for (int i = 0; i < a.length; i++) {
            rep=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[i]) {
                    rep=rep+1;
                }
            }
            if (rep==0) {
            cont=cont+2;
            }
        }
        int[] inter=new int[cont];
        for (int i = 0; i < a.length; i++) {
            rep=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[i]) {
                    rep=rep+1;
                }
            }
            if (rep==0) {
                if (simetria<cont) {
                inter[simetria]=a[i];
                simetria=simetria+1;
                
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            rep=0;
            for (int j = 0; j < a.length; j++) {
                if (a[i]==b[i]) {
                    rep=rep+1;
                }
            }
            if (rep==0) {
                if (simetria<cont) {
                inter[simetria]=b[i];
                simetria=simetria+1;
                }
            }
        }
        System.out.println("los datos de la interseccion son: ");
        for (int i = 0; i < inter.length; i++) {
            System.out.println(inter[i]);
        }
    }
}
