import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int goalNumber, loop = 0, total = 0;
        double avgNumber;
        System.out.print("Pls enter a number: ");
        goalNumber = input.nextInt();

        for (int i = 1; i<=goalNumber;i++)
        {
            if (i%3==0 && i%4==0){
                System.out.println("Divisible Number(s): " + i);
                total+=i;
                loop++;
            }
        }
        avgNumber=total/loop;
        System.out.println("Average of Divisible Numbers: " + avgNumber);
        input.close();
    }
}