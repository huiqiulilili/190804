public class Practice8 {
    public static void method(int[] array){
        array[0] = 10;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        method(array);
        System.out.println(array[0]);
    }
}
