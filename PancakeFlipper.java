import java.util.*;
import java.io.*;
public class PancakeFlipper {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= t; ++i) {
        String s=in.next();
        int k=in.nextInt();
        String res = new PancakeFlipper().useFlipper(s, k);
        System.out.println("Case #" + i + ": " + res);
    }
  }
  
  private String useFlipper(String str, int k) {
    char[] s=str.toCharArray();
    int flip=0;
    for (int i=0; i<s.length-k+1; i=i+1){
        if (s[i]=='-'){
            flip=flip+1;
            for (int j=i; j<i+k; j=j+1)
                s[j] = (s[j] == '-') ? '+' : '-';
        }
    }
    for (int i=0; i<s.length; i=i+1){
        if (s[i]=='-')
            return "IMPOSIBBLE";
    }
    return Integer.toString(flip);
  }
}
