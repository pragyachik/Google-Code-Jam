import java.util.Scanner;
public class AWholeNewWorld{
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        //System.out.println("Test");
        int t=kb.nextInt();
        OUTER:
        for(int i=1; i<=t; i++){
            int n=kb.nextInt();
            int l=kb.nextInt();
            //System.out.println(n+" "+l);
            char a[][]=new char[n][l];
            kb.nextLine();
            for(int q=0; q<n; q++){     
                
                String temp=kb.next();
                for(int w=0; w<l; w++){
                    a[q][w]=temp.charAt(w);
                }     
            }      
            
            char b[]=new char[l];
            
            for(int q=0; q<l; q++){
                for(int w=0; w<n; w++){
                    for(int tm=0; tm<=q; tm++){
                        b[tm]=a[w][tm];
                    }                        
                    for(int g=0; g<n; g++){
                        char arr[]=b;                        
                        for(int tm=q+1; tm<l; tm++){
                            arr[tm]=a[g][tm];
                            //System.out.println(arr[0]+""+arr[tm]+" "+a[g][tm]);
                        }                        
                        if(!isPresent(a, arr, l, n)){
                            System.out.print("Case #"+i+": ");                            
                            for(int u=0; u<arr.length; u++){
                                System.out.print(arr[u]);
                            }
                            System.out.println();
                            continue OUTER;
                        }
                    }
                }
            }
            
            
            
            
            System.out.print("Case #"+i+": "+((char)45));
            System.out.println();
        }
    }
    public static boolean isPresent(char a[][], char b[], int l, int n){
        outer:
        for(int j=0; j<n; j++){
            
            for(int i=0; i<l; i++){
                
                if(a[j][i]!=b[i]){
                    continue outer;
                }
                if(a[j][i]==b[i]&&i==l-1){
                    
                    return true;
                }
            }
        }
        return false;
    }
}
