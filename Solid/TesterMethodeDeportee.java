public class TesterMethodeDeportee {

    public static void main(String[] args){
        Date maDate = new Date(22,12,22);
        TraiterDate unTraitementDeDate = new TraiterDate(maDate);
        System.out.println (unTraitementDeDate.toInt());
    }
}
