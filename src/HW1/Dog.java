package HW1;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ovnerName, LocalDate birthday) {
        super(name, illness, ovnerName, birthday);
    }
}
