package data;

import com.github.javafaker.Faker;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {


    private DataGenerator() {
    }
    private static final Faker faker = new Faker(new Locale("ru"));

    public static String  generateDate(int days) {

        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String generateCity() {

        String city = faker.address().city();
        return city;
    }


    public static String generateName() {

        return faker.name().lastName() + " " + faker.name().firstName();
    }

    public static String generatePhone() {

        return faker.phoneNumber().phoneNumber();
    }

    public static class Registration {
        private Registration() {
        }

        public static UserInfo generateUser(String locale) {

            return new UserInfo(generateCity(),generateName(),generatePhone());
        }

    }

    @Value
    public static class UserInfo {
        String city;
        String name;
        String phone;
    }
}
