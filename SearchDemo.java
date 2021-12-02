import java.util.Random;
import java.util.Arrays;

public class SearchDemo {
    private static Random random;
    private static final int STRLEN = 10;

    /* Returns an array of n Strings, each of size STRLEN  */
    public static String[] randomStrings(int n) {
        String[] s = new String[n];
        if (random == null) random = new Random();
        
        for(int i=0;i<n;i++) {
            StringBuffer sb = new StringBuffer();
            sb.append((char) ('A' +  random.nextInt(26)));
           
           for(int j=0; j<STRLEN; j++) 
               sb.append((char) ('a' +  random.nextInt(26)));
           
           s[i] = sb.toString();
           sb = null;
        }
        return s;
    }
    
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        String[] s = randomStrings(25);
        String x = s[0];
        //Integer[] a = {2,4,65,23,123,43};
        //Integer k = 123; 
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        
        System.out.println("x: "+x+ "; Index: " + bs.search(s,x));
        System.out.println("x: abc; Index: " + bs.search(s,"abc"));
    }
}
// Quellen : Ihre Vorlessung Folien von Sortieralgorithmen