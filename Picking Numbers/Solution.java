import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int pickingNumbers(List<Integer> a) {
        int listSize=a.size();
        int count=1;
        int result=0;
        boolean checked=false;
        for(int i=0;i<listSize;i++){
            for(int j=i+1;j<listSize;j++){
                if(a.get(i)==a.get(j)){
                    count++;
                }
            }
            
            for(int z=i-1;z>0;z--){
                if(a.get(i)==a.get(z)){
                    checked=true;
                }
            }
            if(checked=false){
                result+=count;  
            }
            checked=false;
            count=1;
        
        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
