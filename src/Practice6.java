public class Practice6 {
    /**
     * 计算 n  的位数
     * @param n
     */
    public static int calcDigitNum(long n){
        int digital = 0;
        for(;n > 0;n = n / 10){
            digital++;
        }
        return digital;
    }
    public static void main(String[] args) {
        System.out.println(calcDigitNum(123456789));

    }
}
