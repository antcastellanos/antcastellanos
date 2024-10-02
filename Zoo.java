import java.util.Scanner;

interface Animal{
    String getName();
    String getSound();
    String getType();
}
 abstract class AnimalBase implements Animal {
     protected String name;

     public AnimalBase(String name) {
         this.name = name;
     }

     public String getName() {
         return this.name;
     }
     public String toString(){
         return "Animal's Info:\n" +
                 "Name: " + getName() + "\n" +
                 "Type: " + getType() + "\n" +
                 "Sound: " + getSound();
     }
 }

 class Lion extends AnimalBase {
     public Lion(String name) {
         super(name);
     }

     public String getType() {
         return "Mammal";
     }

     public String getSound() {
         return "Roar";
     }
 }
 class Parrot extends AnimalBase {
    public Parrot(String name){
        super(name);
    }
    public String getType(){
        return "Bird";
    }
    public String getSound(){
        return "Chirp";
    }
 }
 class Shark extends AnimalBase {
    public Shark(String name){
        super(name);
 }
 public String getType(){
        return "Fish";
 }
 public String getSound(){
        return "...";
    }
}





public class Zoo {
    public static void main(String[] args) {
        String lionName, parrotName, sharkName;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the Lion: ");
        lionName = sc.nextLine();
        Lion lion = new Lion (lionName);

        System.out.println("Enter the name of the Parrot: ");
        parrotName = sc.nextLine();
        Parrot parrot = new Parrot(parrotName);

        System.out.println("Enter the name of the Shark: ");
        sharkName = sc.nextLine();
        Shark shark = new Shark(sharkName);

        System.out.println(lion);
        System.out.println(parrot);
        System.out.println(shark);


    }
}
