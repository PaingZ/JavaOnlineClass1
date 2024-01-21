public class Program7 {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            //i = 1         2<=1
            //i = 2         1<=2
            //i = 3         1<=3
            //i = 4
            for(int j = 1; j<=i; j++){
                System.out.printf("%d", j);
            }
            System.err.println();
        }
    }   
// 1
// 12
// 123
// 1234
// 12345
}
