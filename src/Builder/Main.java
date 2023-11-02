package Builder;

import Builder.Builder;

public class Main {
    public static void main(String[] args) {

        // creating the director and the builder objects
        Director director = new Director();
        Builder builder = new Builder();
        director.buildBugatti(builder);
        //Car car = builder.build();
        builder.id(2023);
        builder.model("MODEL NAME");
        System.out.println(builder.build());

        // testing...
        // if we want to create a bugatti
        // using the dorector clas, we used pre-defined configuration of buggatti car
        //director.buildBugatti(builder);
        //builder.model("Chiron");
        //builder.id(1999);
        //System.out.println("Before editing the informtion");
        //System.out.println(builder.build());
        //System.out.println("----------------------------");
        //builder.brand(".....NEW BRAND NAME....");
        //System.out.println("After editing the informtion");

    }
}