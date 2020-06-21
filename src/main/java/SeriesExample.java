
/*
 * public class SeriesExample {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */
import java.util.*;
import java.io.*;

class SeriesExample{
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

            double s=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        for(double j=0;j<n;j++)
        {
         s=s+a+Math.pow(2,j)*b;
            System.out.print((int)s+" ");
            
        }
          System.out.println(); 
          s=0; 
        }
}
}