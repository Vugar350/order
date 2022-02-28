package generator;

import com.github.javafaker.Faker;
import data.PageInfo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Generator {
    public static class Registration {
        private Registration() {}
        public static PageInfo generateByCard(String locale) {
            Faker faker =new Faker(new Locale(locale));
            return new PageInfo(faker.name().fullName(),
                    faker.phoneNumber().phoneNumber(),
                    LocalDate.now().plusDays(3)
            );

        }
    }
}
