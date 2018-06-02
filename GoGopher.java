import java.util.Scanner;
public class GoGopher{
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        //System.out.println("hello");
        int t=kb.nextInt();
        out:
        for(int i=1; i<=t; i++){
            int a=kb.nextInt();
            int x[][]=new int[4][5];
            while(empty(x)){
                for(int j=1; j<=2; j++){
                    for(int k=1; k<=3; k++){
                        while(notFull(j,k,x)){
                            //printarray(x);
                            System.out.println((j+10)+" "+(k+10));
                            int l=kb.nextInt();
                            int m=kb.nextInt();
                            if(l==-1) System.exit(0);
                            if(l==0&&m==0) continue out;
                            x[l-10][m-10]=1;
                            //printarray(x);
                        }
                    }
                }
            }
        }
    }
    public static boolean empty(int x[][]){
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[0].length; j++){
                if(x[i][j]==0){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean notFull(int l, int m, int x[][]){
        for(int i=-1; i<=1; i++){
            for(int j=-1; j<=1; j++){
                if(x[l-i][m-j]==0){
                    return true;
                }
            }
        }
        return false;
    }
    /*public static void printarray(int x[][]){
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[0].length; j++){
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }*/
}
