package task3;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class SupplierImplementation {
    public static void main(String[] args) {
        // Generating password using Supplier interface
        Supplier<String> passwordGenerator = () -> {
            String[] everythingPassShouldContain = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i",
                                                                "j", "k", "l", "m", "n", "o", "p", "q", "r",
                                                                "s", "t", "u", "v", "w", "x", "y", "Z", "1",
                                                                "2", "3", "4", "5", "6", "7", "8", "9", "0",
                                                                "!","@","#","$","%","^","&","*","?"};
            String password = "";
            for(int i = 0; i < 8; i++) {
                password += everythingPassShouldContain[ThreadLocalRandom.current().nextInt(0, everythingPassShouldContain.length)];
            }
            return password;
        };

        System.out.println(passwordGenerator.get());
    }
}

