import java.util.Scanner;

public class ScanerFalla{

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print ("Insert a number: ");
input.nextInt();
System.out.print("Text1:");
input.nextLine();
System.out.print("Text2: ");
input.nextLine();
}
}