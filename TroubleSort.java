import java.util.Scanner;
import java.io.*;
public class TroubleSort{
    static long err;
    public static void main(String args[]){
        Scanner kb= new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        //System.out.println("hello");
        int t=kb.nextInt();
        for(int i=0; i<t; i++){
            int n=kb.nextInt();
            long a[]=new long[n];
            for(int j=0; j<n; j++){
                a[j]=kb.nextLong();
            }
            troublesort(a);
            if(check(a))
                System.out.println("Case #"+(i+1)+": "+"OK");
            else
                System.out.println("Case #"+(i+1)+": "+err);            
        }
    }
    public static void troublesort(long a[]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-2; j++){
                if(a[j]>a[j+2]){
                    long temp=a[j];
                    a[j]=a[j+2];
                    a[j+2]=temp;
                }
            }
        }        
    }
    public static boolean check(long a[]){
        for(int i=0; i<a.length-1; i++){
            if(a[i]>a[i+1]){
                err=i;
                return false;                
            }           
        }       
        return true;
    }
}
