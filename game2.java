import java.util.Scanner;

class game{
    int num;
    int v;
    game(){
        num =45;
    }
    public void takeuserinput(int as){
        v=as;
    }
    public void iscoorectnumber(){
        if(v==num){
            System.out.println("True the number is correct");
            System.out.println("You won enjoi, now go eat burger");
            System.exit(0);
        }
        else if(v>num){
            System.out.println("Choose a samller number");
        }
        else if(v<num){
            System.out.println("Choose a bigger number");
        }
    }
}

public class game2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game.");
        System.out.println("You have a total of 10 Guesses for the Game.");
        System.out.println("Let's Begin----");
        game gg = new game();
        for(int i =10;i>0;i--){
            System.out.println("Enter your number here:");
            int a = sc.nextInt();
            gg.takeuserinput(a);
            gg.iscoorectnumber();
            System.out.print("Guesses remaining--");
            System.out.println(i-1);
        }
        System.out.println("Game over.....");


    }
    
}
