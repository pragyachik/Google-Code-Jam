import java.util.*;
import java.io.*;
public class SenateEvacuation{
    public static void main(String args[]){
        Scanner kb= new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long t=kb.nextInt();        
        for(long i=1; i<=t; i++){
            int n=kb.nextInt();
            long a[]=new long[n];
            for(int j=1; j<=n; j++){
                a[j-1]=kb.nextLong();
            }   
            System.out.print("Case #"+i+": ");
            int max1=0;
            int max2=n-1;            
            while(sum(a)!=0){
                if(sum(a)==2){
                    for(int k=0; k<n; k++){
                        if(a[k]!=0){
                            System.out.print((char)(65+k)+"");                            
                            a[k]--;
                            k--;
                        }
                    }     
                    System.out.println();
                    continue;
                }
                for(int k=0; k<n; k++){
                    if(a[max1]<=a[k]){
                        max2=max1;
                        max1=k;
                    }
                }
                if(a[max1]==a[max2]&&a[max1]!=1){
                    System.out.print((char)(max1+65)+""+(char)(max2+65));
                    System.out.print(" ");
                    a[max1]--;
                    a[max2]--;
                }
                else{
                    System.out.print((char)(max1+65)+"");
                    System.out.print(" ");
                    a[max1]--;
                }
            }
        }    
    }
    public static int sum(long a[]){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
        return sum;
    }
}