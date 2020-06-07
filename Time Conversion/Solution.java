import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] temp=new String[3];
        String a=s.substring(8,10);
        temp=s.split(":");
        if(a.equals("PM")){
            switch(temp[0]){
                case "01":
                    temp[0]="13";
                    break;
                case "02":
                    temp[0]="14";
                    break;
                case "03":
                    temp[0]="15";
                    break;
                case "04":
                    temp[0]="16";
                    break;
                case "05":
                    temp[0]="17";
                    break;
                case "06":
                    temp[0]="18";
                    break;
                case "07":
                    temp[0]="19";
                    break;
                case "08":
                    temp[0]="20";
                    break;
                case "09":
                    temp[0]="21";
                    break;
                case "10":
                    temp[0]="22";
                    break;
                case "11":
                    temp[0]="23";
                    break;
                
            }
        }
        if(a.equals("AM")){
            if(temp[0].equals("12")){
                temp[0]="00";
            }
        }
        return temp[0]+":"+temp[1]+":"+temp[2].substring(0,2);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}