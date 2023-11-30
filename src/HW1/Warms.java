package HW1;

import java.time.LocalDate;

public class Warms extends Animal{
    public Warms() {
        super();
    }
    public Warms(String name, Illness illness, String ovnerName, LocalDate birthday) {
        super(name, illness, ovnerName, birthday);
    }
}
