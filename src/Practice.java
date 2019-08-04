import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] a = new int[100];
        System.out.println(a.length);
        String[] b = new String[10];
        System.out.println(b.length);
        System.out.println(b[0]);
        for(int i = 0;i < 10;i ++){
            b[i] = "";
        }
        System.out.println(b[0]);
        int[] c = new int[10];
        for(int i = 0;i < 10;i ++){
            c[i] = i;
        }
            System.out.println(Arrays.toString(c));
        int[] d = new int[2];
        for(int i = 0; i< 2;i ++){
            d[i] = i;
        }
        int[] e = Arrays.copyOf(d,2*d.length);
        System.out.println(e.length);
        for(int i = 0; i < e.length;i ++){
            System.out.println(e[i]);
        }
    }

}
