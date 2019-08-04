public class Practice7 {
    //n 的阶乘
    public static long factorial1(int n){
        if(n == 0 || n == 1){
            return 1;
        }else {
            return factorial1(n-1) * n;
        }
    }

    //n 的阶乘 （普通方法）
    public static long factorial2(int n){
        long fact = 1;
        for(int i = 1;i <= n;i ++){
            fact = fact * i;
        }
        return fact;
    }


    /***
     * 利用公式
     * e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ...
     * 计算自然对数的底 e
     * @param n 一共需要计算 n 项
     *
     * */
    public static double calcE(int n){
        double num = 0;
        for(int i = 0;i < n;i ++ ){
            num = num + ((double)1 /factorial1(i)) ;
        }
        return num;
    }

    /**
     * 利用公式
     * e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ...
     * 计算自然对数的底 e
     * @param precision 最后一项的精度 <= precision
     * @return
     */
    public static double calcE(double precision){
        double e = 0;
        int n = 0;
        while(true){
            double item = 1.0 / factorial1(n ++);
            e += item;
            if(item < precision){
                break;
            }
        }
        return e;
    }

    /**
     * 利用公式
     * Pi / 4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ...
     * 计算 pi 的值
     * @param n 一共计算 n 项
     * @return
     */
    public static double calcPi(int n){
        double pi4 = 0;
        for(int i = 0;i < n;i ++){
            int m = 2 * i + 1;
            if(i % 2 == 0){
                pi4 = pi4 + 1.0 / m;
            }else {
                pi4 = pi4 - 1.0 / m;
            }
        }
        return pi4 * 4;
    }

    public static String reverse(String s){
        int length = s.length();
        String r = "";
        for(int i = length- 1;i >= 0;i --){
                char ch = s.charAt(i);
                r = r + ch;
        }
        return  r;
    }

    /**
     * 10 进制转 16 进制，计算公式如下例
     * 1958 转 16 进制
     * 1958 % 16 == 6   1958 / 16 == 122
     * 122 % 16 == 10 也就是 A   122 / 16 == 7
     * 7 < 16
     * 1958 的 16 进制 为 7A6
     * @param
     * @return
     */
    public static String decToHex(int dec){
        String hex = "";
        while (dec >= 16 ){
            int remainder = dec % 16;
            dec = dec / 16;

            if(remainder < 10){
                hex += remainder;
            }else {
                char ch = (char)('A'+ (remainder - 10));
                hex += ch;
            }
        }
        if(dec != 0){
            hex += dec;

        }
        return reverse(hex);
    }
    public static void main(String[] args) {
        System.out.println(factorial1(3));
        System.out.println(factorial2(3));
        System.out.println(calcE(9));
        System.out.println(calcE(0.00001));
        System.out.println(calcPi(5));
        System.out.println(reverse("hahahaha"));
        System.out.println(decToHex(1958));
    }

}
