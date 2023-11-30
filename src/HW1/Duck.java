package HW1;

import java.time.LocalDate;

public class Duck extends Animal{
    public Duck() {
        super();
    }
    public Duck(String name, Illness illness, String ovnerName, LocalDate birthday) {
        super(name, illness, ovnerName, birthday);
    }
}
