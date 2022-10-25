package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN

public class App {

    public static int getCountOfFreeEmails(List<String> emails) {
        List<String> freeDomains = List.of("gmail.com", "yandex.ru", "hotmail.com");
        return (int) emails.stream()
                .filter(email -> freeDomains.contains(email.substring(email.indexOf('@') + 1)))
                .count();
    }

    public static void main(String[] args) {
        String[] emails = {
                "info@gmail.com",
                "info@yandex.ru",
                "mk@host.com",
                "support@hexlet.io",
                "info@hotmail.com",
                "support.yandex.ru@host.com"
        };

        List<String> emailsList = Arrays.asList(emails);
        System.out.println(App.getCountOfFreeEmails(emailsList));
    }
}

// END
