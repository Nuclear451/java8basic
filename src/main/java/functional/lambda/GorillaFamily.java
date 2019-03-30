package functional.lambda;

/**
 * Created by Nuclear on 06.10.2018.
 */
public class GorillaFamily {
    String walk = "walk";
    private void everyonePlay(boolean baby){
        final String approach = "amble";
        //approach = "123";


        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);

    }

    void play(Gorilla g){
        System.out.println(g.move());
    }


    public static void main(String[] args) {
        GorillaFamily gf = new GorillaFamily();

        gf.everyonePlay(true);
        System.out.println("_________");
        gf.everyonePlay(false);
    }
}
