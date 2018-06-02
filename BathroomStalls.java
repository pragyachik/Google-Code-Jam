import java.util.Scanner;
import java.io.*;
public class BathroomStalls{
    static int left=0;
    static int right=0;
    public static void main(String args[]){
        Scanner kb= new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        //System.out.println("hello");
        int t=kb.nextInt();
        for(int i=1; i<=t; i++){
            int n=kb.nextInt();
            int k=kb.nextInt();            
            String temp="x";
            String comp="xx";
            for(int j=0; j<n; j++){
                temp+=".";
                comp+="x";
            }
            temp+="x";
            while(k!=0){
                int max=0;
                int pos=start(temp);
                for(int j=0; j<n+2; j++){
                    if(temp.charAt(j)=='.'){
                        if(max<maximum(temp, j)){
                            max=maximum(temp, j);
                            pos=j;                            
                            //System.out.println(pos);
                        }
                        if(max==maximum(temp, j)){                        
                            if(temp.charAt(j)=='.'){
                                int min=minimum(temp, pos);
                                if(min<=minimum(temp, j)){
                                    min=minimum(temp, j);
                                    pos=j;
                                    //System.out.println(pos);
                                }
                            }                            
                        }
                    }
                }
                //System.out.println("Pos: "+pos);    
                maximum(temp, pos);
                if(temp.equals(comp)){
                    break;
                }
                temp=temp.substring(0,pos)+'x'+temp.substring(pos+1,temp.length());
                //System.out.println(temp);
                k--;
            }
            if(left>right){
                System.out.println("Case #"+i+": "+left+" "+right);
            }
            else{
                System.out.println("Case #"+i+": "+right+" "+left);;
            }
        }
    }
    public static int maximum(String s, int pos){      
        calc(s,pos);
        if(left>right){
            return right;
        }
        else{
            return left;
        }
    }
    public static int minimum(String s, int pos){        
        calc(s,pos);
        if(left>right){
            return left;
        }
        else{
            return right;
        }
    }
    public static void calc(String s, int pos){
        int lef=0;
        int rig=0;
        for(int i=pos+1; i<s.length(); i++){
            if(s.charAt(i)=='.'){
                rig++;
            }
            else break;
        }
        for(int i=pos-1; i>=0; i--){
            if(s.charAt(i)=='.'){
                lef++;
            }
            else break;
        }
        left=lef;
        right=rig;
        //System.out.println("Left: "+left+" Right: "+right);        
    }
    public static int start(String a){
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='.'){
                return i;
            }
        }
        return 0;
    }
}






