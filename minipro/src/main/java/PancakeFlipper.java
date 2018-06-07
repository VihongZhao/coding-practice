import java.util.*;
import java.io.*;
public class PancakeFlipper {
    public static void main(String[] args) throws FileNotFoundException{
        PancakeFlipper pfliper=new PancakeFlipper();
        System.out.println(pfliper.showStart());
        pfliper.run(); 
    }
    
    public String showStart() {
        return "===========Program starts===========";
    }
    
    public void run() throws FileNotFoundException{
        BufferedReader br = new BufferedReader(new FileReader( "input.txt"));
        Scanner in = new Scanner(br);
        PrintWriter out = new PrintWriter("output.txt");
        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            String s=in.next();
            int k=in.nextInt();
            String res = useFlipper(s, k);
            System.out.println("Case #" + i + ": " + res);
            out.println("Case #" + i + ": " + res);
        }
        out.close();
    }
    
    public String useFlipper(String str, int k) {
        char[] s=str.toCharArray();
        int flip=0;
        for (int i=0; i<s.length-k+1; i=i+1){
            if (s[i]=='-'){
                flip=flip+1;
                for (int j=i; j<i+k; j=j+1)
                    s[j] = (s[j] == '-') ? '+' : '-';
            }
        }
        if (verify_all_happy(s))
            return Integer.toString(flip);
        else
            return "IMPOSSIBLE";
    }
    
    public Boolean verify_all_happy(char[] s){
        for (int i=0; i<s.length; i=i+1)
            if (s[i]=='-') return false;
        return true;
    }
}








// import java.util.*;
// import java.io.*;
// public class PancakeFlipper {
    // public static void main(String[] args) {
        // PancakeFlipper pfliper=new PancakeFlipper();
        // System.out.println(pfliper.showStart());
        // pfliper.run(); 
    // }
    
    // public String showStart() {
        // return "===========Program starts===========";
    // }
    
    // public void run(){
        // Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        // int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        // for (int i = 1; i <= t; ++i) {
            // String s=in.next();
            // int k=in.nextInt();
            // String res = useFlipper(s, k);
            // System.out.println("Case #" + i + ": " + res);
        // }
    // }
    
    // public String useFlipper(String str, int k) {
        // char[] s=str.toCharArray();
        // int flip=0;
        // for (int i=0; i<s.length-k+1; i=i+1){
            // if (s[i]=='-'){
                // flip=flip+1;
                // for (int j=i; j<i+k; j=j+1)
                    // s[j] = (s[j] == '-') ? '+' : '-';
            // }
        // }
        // if (verify_all_happy(s))
            // return Integer.toString(flip);
        // else
            // return "IMPOSSIBLE";
    // }
    
    // public Boolean verify_all_happy(char[] s){
        // for (int i=0; i<s.length; i=i+1)
            // if (s[i]=='-') return false;
        // return true;
    // }
// }
