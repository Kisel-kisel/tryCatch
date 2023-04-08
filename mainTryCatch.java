package tryCatch;

import java.io.IOException;
import java.util.Scanner;

public class mainTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int days = scanner.nextInt();
            int people = scanner.nextInt();
            int answer = days * people;
            System.out.println(answer);
        }
        catch (Exception a){
            throw new IllegalArgumentException("mistake String");
        }
        }


}
