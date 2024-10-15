import java.util.Scanner;

public class ComparePLayers{
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        Scanner scan = new Scanner(System.in);
        player1.readPlayer();
        player2.readPlayer();

        boolean compare = player1.equals(player2);
        if(compare){
            System.out.println("Same Player");
        }else{
            System.out.println("Players are different");
        }


    }


}

