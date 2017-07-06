import java.util.Scanner;

/**
 * Created by jhhta_000 on 2017-07-06.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("N: "+n);

        int[]x=new int[n];
        int total=0;
        for(int i =0;i<n;i++){
            x[i]=in.nextInt();
            total+=x[i];
        }
        double mean = (double) total/n;
        System.out.println(total+","+mean);

        //standard deviation
        long sigma = 0;
        double sd;
        for(int i=0;i<n;i++)
        {
            sigma+=Math.pow(x[i]-mean,2);
            System.out.println("x[i]-mean: "+(x[i]-mean));
            System.out.println("sigma: "+sigma);
        }
        sd=Math.round(Math.sqrt(sigma/n)*10d)/10d;
        System.out.println(sd);


    }

}
