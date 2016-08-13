/**
 * Created by Krzysztof Grabowski on 13.08.16.
 */
public class CatTester {

    public static void main(String[] args) {

        Cat cat = new Cat.Builder("Muffin")
                .owner("Sylvia")
                .age(2)
                .build();

        System.out.println(cat.toString());

    }

}
