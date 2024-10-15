import java.util.Objects;
import java.util.Scanner;

public class Player {
    protected String name;
    protected String team;
    protected int jerseyNumber;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Player player = (Player) o;
//        return jerseyNumber == player.jerseyNumber && Objects.equals(name, player.name) && Objects.equals(team, player.team);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, team, jerseyNumber);
//    }

    public void readPlayer(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Name :");
        name = scan.nextLine();

        System.out.println("team :");
        team = scan.nextLine();

        System.out.println("jerseyNumber :");
        jerseyNumber = scan.nextInt();


    }

    public boolean equals(Player o) {
       if(this.name.equals(o.name)&&this.team.equals(o.team)&&this.jerseyNumber == (o.jerseyNumber)){
           return true;
       }else{
           return false;
       }
    }
}
