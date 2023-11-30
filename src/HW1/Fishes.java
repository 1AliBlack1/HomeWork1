package HW1;

import java.time.LocalDate;

public class Fishes extends Animal{
    public Fishes() {
        super();
    }
    public Fishes(String name, Illness illness, String ovnerName, LocalDate birthday) {
        super(name, illness, ovnerName, birthday);
    }
}
