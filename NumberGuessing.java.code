import java.util.*;
import java.io.*;
public class NumberGuessing{
    public static void main(String args[]){
        Scanner kb= new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long t=kb.nextInt();
        
        for(long i=1; i<=t; i++){
            long a=kb.nextLong();
            long b=kb.nextLong();
            long n=kb.nextLong();
            a=a+1;
            b=b+1;
            for(long j=1; j<=n; j++){
                long m=(a+b)/2;
                System.out.println(m);
                if(j==1)kb.nextLine();
                String in=kb.nextLine();
                if(in.equals("CORRECT")) break;
                if(in.equals("TOO_SMALL")){
                    a=m;
                }
                else if(in.equals("TOO_BIG")){
                    b=m;
                }
                else break;
            }
        
        }
    
    }
}
