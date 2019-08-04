public class Practice4 {
    public static void displayMutipyCation(){
        for(int i = 1; i < 10;i ++){
            for(int j = 1;j < 10;j ++){
                System.out.printf("%d * %d = %d ",j,i,j * i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayMutipyCation();
    }
}
