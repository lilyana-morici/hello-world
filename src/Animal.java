public class Animal {
    public int age;
    public String gender;

    public boolean isMammal() {
        System.out.println("This is the isMammal() method from class Animal");
        return true;
    }

    public void mate() {
        System.out.println("This is the mate() method from class Animal");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();

        myAnimal.isMammal();
        myAnimal.mate();

        myZebra.run();
    }
}
