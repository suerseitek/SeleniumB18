package test.day7_javafaker_webtables;

import com.github.javafaker.Faker;

public class FakerPractice {


    public static void main(String[] args) {

        Faker faker = new Faker();
        String chuckNorris = faker.chuckNorris().fact();
        System.out.println(chuckNorris);
        String harry = faker.harryPotter().character();
        System.out.println(harry);
    }
}
