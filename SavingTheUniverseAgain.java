import java.util.Scanner;
public class SavingTheUniverseAgain{
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        //System.out.println("start");
        int t=kb.nextInt();
        for(int i=1; i<=t; i++){
            long d=kb.nextLong();
            String a=kb.nextLine();
            long ans=algorithm(d,a);
            if(ans==-1) {
                System.out.println("Case #"+i+": IMPOSSIBLE");
                continue;
            }
            System.out.println("Case #"+i+": "+ans);
        }
    }
    public static long algorithm(long d, String a){        
        long swaps=0;
        boolean flag=true;
        while(flag){
            if(calcmax(a)<=d){
                return swaps;
            }
            flag=false;
            for(int j=a.length()-1; j>0; j--){
                char c=a.charAt(j);
                if(c=='S'&&a.charAt(j-1)=='C'){
                    flag=true;
                    swaps++;
                    a=a.substring(0,j-1)+"SC"+a.substring(j+1,a.length());
                    break;
                }
            }            
        }
        if(calcmax(a)<=d){
            return swaps;
        }
        return -1;
    }
    public static long calcmax(String a){
        long max=0;
        long charge=1;
        for(int i=0; i<a.length(); i++){
            char c=a.charAt(i);
            if(c=='C'){
                charge=charge*2;
            }
            if(c=='S'){
                max=max+charge;
            }
        }
        return max;
    }
}
