import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.*;
public class CubicUFO{
    public static double m1,m2,n1,n2, y11;
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        //System.out.println("start");
        int t=kb.nextInt();
        for(int i=1; i<=t; i++){
            double a=kb.nextDouble();
            //double a=Math.sqrt(2.0);
            //System.out.println(a);
            double c=0;
            System.out.println("Case #"+i+": ");
            findAngle(a);           
            //findAngles(a);
            System.out.println(m1+" "+n1+" "+c);
            System.out.println(m2+" "+n2+" "+c);
            System.out.println(c+" "+c+" 0.5");
        }
    }    
    /*public static void findAngled(double m){
        double lx=-m/2;
        double ly=-Math.sqrt(2-Math.pow(m,2))/2;
        double rx=m/2;
        double ry=Math.sqrt(2-Math.pow(m,2))/2;
        double tan=Math.sqrt(2-Math.pow(m,2))/m;
        double tans=((1-tan)/(1+tan));
        double xtem=ry*(tans+1/tans)+m;
        double x=xtem/(1/tans-tans);
        double y=tans*(x+ry)-rx;
        System.out.println(rx+" "+ry);
        m1=(lx+x)/2;
        m2=(ly+y)/2;
        n1=(rx+x)/2;
        n2=(ry+y)/2;
    }*/
    public static void findAngle(double m){
        double angle=Math.acos(m/Math.sqrt(2));
        //df.format(angle);
        //System.out.println(angle);
        angle=Math.round(10000000.0*angle)/10000000.0;
        //System.out.println(angle);
        y11=Math.cos(angle)*(1/Math.sqrt(2));
        //df.format(y11);
        double x1=-y11+Math.cos(Math.PI/4-angle)/2;
        double x2=y11-Math.sin(Math.PI/4-angle)/2;
        //System.out.println(x2);
        //x2=Math.round(10000000*x1)/10000000;
        //double x=Math.sqrt(Math.pow(0.5,two)/(one+Math.pow(tep1,two)));
        //System.out.println(x);         
        y11=Math.sin(angle)*(1/Math.sqrt(2));
        double y1=-Math.sin(Math.PI/4-angle)/2-y11;
        double y2=-Math.cos(Math.PI/4-angle)/2+y11;
        //double x1=Math.sqrt(Math.pow(0.5,two)/(one+Math.pow(tep2,two)));
        //double x=x2;
        //double x1n=x1;
        //double y1=tep2*x1;
        //double y=tep1*x;
        //System.out.println("Old method "+x+" "+x1);
        //System.out.println(tep2);
        //if(1/tep1==0) y=0.5;
        m1=x1;
        m2=x2;
        n1=y1;
        n2=y2;
        
    }
    /*public static void findAngles(double m){
        double angle=Math.acos(m/Math.sqrt(2));
        double x1=Math.cos(Math.PI/4-angle)/2;
        double x2=Math.cos(Math.PI/4+angle)/2;
        //System.out.println("New method "+x1+" "+x2);
    }*/
}
