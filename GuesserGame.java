import java.util.Scanner;

class Guesser{
    int GuesserNum;
    public int GuesserNumb(){
        Scanner scan = new Scanner(System.in);
        System.out.print("kindly enter  the number:");
        GuesserNum = scan.nextInt();
        return GuesserNum;

    }
}

class Player{
    int PlayerNum;
    public int PlayerNumb(){
        Scanner scan = new Scanner(System.in);
        PlayerNum = scan.nextInt();
        return PlayerNum;
    }
}

class Umpire
{
    int GuesserNum;
    int PlayerNum1;
    int PlayerNum2;
    int PlayerNum3;


    public void CollectNumFromGuesser(){

        Guesser Gu = new Guesser();
        GuesserNum = Gu.GuesserNumb();

    }
    public void CollectNumFromPlayers(){



        Player P1 = new Player();
        System.out.println();
        System.out.print("Player1 kindly guess the number:");
        PlayerNum1 = P1.PlayerNumb();



        Player P2 = new Player();
        System.out.print("Player2 kindly guess the number:");
        PlayerNum2 = P2.PlayerNumb();



        Player P3 = new Player();
        System.out.print("Player3 kindly guess the number:");
        PlayerNum3 = P3.PlayerNumb();






    }

    public void Compare(){

        if(GuesserNum==PlayerNum1)
        {
            if(GuesserNum==PlayerNum2 && GuesserNum==PlayerNum3){
                System.out.println("All player won the game");
            }

            else if(GuesserNum==PlayerNum2){
                System.out.println("Player1 and Player2 won the game");
            }

            else if(GuesserNum==PlayerNum3){
                System.out.println("Player1 and Player3 won the game");
            }
        }

        else if(GuesserNum==PlayerNum2){
            if(GuesserNum==PlayerNum3){
                System.out.println("Player2 and Player3 won the game");
            }
            else {
                System.out.println("Player2 won the game ");
            }
        }

        else if(GuesserNum==PlayerNum3){
            System.out.println("Player3 won the game");

        }

        else{
            System.out.println("All players lost the game");
        }


    }



}

public class GuesserGame{
    public static void main(String[] args) {
        System.out.println("....Game started....");
        Umpire UM = new Umpire();
        UM.CollectNumFromGuesser();
        UM.CollectNumFromPlayers();
        System.out.println();
        UM.Compare();
        System.out.println();
        System.out.println("....Game over.....");
    }
}