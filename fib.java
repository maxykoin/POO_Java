// fazer um programa previamente feito em python com java
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int n3;
        
        System.out.printf("Quantidade :p\n");
        int n = input.nextInt();
        
        System.out.printf("%d", n1);
        
        for(int i = 0; i <= n; i++){
            n3 = n1 + n2;
            System.out.printf(" -> %d", n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
