public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(4, Color.WHITE, 7);
        System.out.println(dog.getInfo("Reks"));
        System.out.println(dog.getInfo());
        System.out.println(dog.getShortInfo());
        Alabay alabay=new Alabay(3,Color.BROWN,5);
        System.out.println(alabay.getInfo("Asan"));
        Alabay alabay2=new Alabay(6,Color.RED,4);
        System.out.println(alabay.getInfo("Uson"));
    }}