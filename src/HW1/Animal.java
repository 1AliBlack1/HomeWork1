package HW1;

import java.time.LocalDate;

public class Animal {
    private String name;
    private Illness illness;
    private String ovnerName;
    private LocalDate birthday;

    public Animal() {
    }
    public Animal(String name, Illness illness, String ovnerName, LocalDate birthday) {
        this.name = name;
        this.illness = illness;
        this.ovnerName = ovnerName;
        this.birthday = birthday;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Illness getIllness() {
        return illness;
    }
    private void toWakeUp(){
        System.out.println(getClass().getSimpleName() + " woke up");
    }
    private void toWakeUp(String time){
        System.out.println(getClass().getSimpleName() + " woke up at "+time);
    }
    private void eat(){
        System.out.println(getClass().getSimpleName() + " ate");
    }
    private void play(){
        System.out.println(getClass().getSimpleName() + " played");
    }
    private void sleep(){
        System.out.println(getClass().getSimpleName() + " sleep");
    }
    public void liveCycle(){
        toWakeUp();
        eat();
        play();
        sleep();
    }
    private void run(){
        System.out.println((getClass().getSimpleName() + " are runnig"));
    }
    private void swim(){
        System.out.println((getClass().getSimpleName() + " are swimming"));
    }
    private void fly(){
        System.out.println((getClass().getSimpleName() + " are flyig"));
    }
    private void crawl(){
        System.out.println((getClass().getSimpleName() + " are crawling"));
    }
    public void fish(){
        swim();
    }
    public void birds(){
        fly();
        run();
    }
    public void otherAnumals(){
        run();
        swim();
    }
    public void warms(){
        crawl();
    }

}
