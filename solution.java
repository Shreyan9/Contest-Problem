import java.util.*;
import java.io.*;
import java.lang.Math;
public class solution {
    public static void main(String [] args) throws IOException{
        Scanner i = new Scanner(new File("Trigonometry.dat"));
        int count = i.nextInt();
        for(int j = 0; j<count; j++){
            int horizontal = i.nextInt();
            int vertical = i.nextInt();
            System.out.println("Horizontal side length = "+horizontal);
            System.out.println();
            System.out.println("Vertical side length = "+vertical);
            System.out.println();
            int hypotenuse = (int) (Math.sqrt(Math.pow(horizontal,2)+Math.pow(vertical,2)));
            System.out.println("Hypotenuse length = "+hypotenuse);
            System.out.println();
            System.out.println("Sin x = "+vertical+"/"+hypotenuse);
            System.out.println();
            System.out.println("Cos x = "+horizontal+"/"+hypotenuse);
            System.out.println();
            System.out.println("Tan x = "+vertical+"/"+horizontal);
            System.out.println();
            System.out.println("Csc x = "+hypotenuse+"/"+vertical);
            System.out.println();
            System.out.println("Sec x = "+hypotenuse+"/"+horizontal);
            System.out.println();
            System.out.println("Cot x = "+horizontal+"/"+vertical);
            System.out.println();
            System.out.println();
        }
    }
}
