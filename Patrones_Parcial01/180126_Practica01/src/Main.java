public class Main {
    public static void main(String [] args){

        System.out.println("Practica 01");
        Queen queen = new Queen(new KnifeBehavior());

        Troll troll = new Troll(new CrossBowBehavior());

        King king = new King(new SwordBehavior());

        Knight knight = new Knight(new AxeBehavior());

    }
}
