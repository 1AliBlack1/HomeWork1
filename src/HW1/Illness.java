package HW1;

public class Illness {
    public String illnessName;

    public Illness(String illnessName) {
        this.illnessName = illnessName;
    }
    public void heall(){
        System.out.println("One anal clisma");
    }

    @Override
    public String toString() {
        return illnessName;
    }
}
