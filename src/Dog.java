public class Dog extends Animal {

    public Dog(int age, Color color, int weight) {
        super(age, color, weight);
    }

    public String getInfo() {
        return "age " + this.getAge() + "\n" + "color " + this.getColor() + "\n" + "weight " + this.getWeight() + "\n";
    }

     public String getInfo(String name) {
        return "age " + this.getAge() + "\n" +
                "color " + this.getColor() + "\n" +
                "weight " + this.getWeight() + "\n" +
                "name "+ name+"\n";
    }

    final public String getShortInfo() {
        return "age " + this.getAge() + "\n" +
                "color " + this.getColor() + "\n";
    }
}
