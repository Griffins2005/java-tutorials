package enumtutorial;

public class Main {
    public static void main(String[] args) {
        Level lvl = Level.LOW;
        System.out.println(lvl.getLvl());

        lvl.setLvl(5);
        System.out.println(lvl.getLvl());
        // String en = lvl.toString();
        // Level[] arr = Level.values();

        // for (Level e : arr) {
        //     System.out.println(e);
        // }

        // if (lvl == Level.LOW) {
        //     System.out.println(lvl);
        // } else if (lvl == Level.MEDIUM) {
        //     System.out.println(lvl);
        // } else {
        //     System.out.println(lvl);
        // }
    }
}
