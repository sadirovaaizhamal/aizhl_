final public class Alabay extends Dog {
    public Alabay(int age, Color color, int weight) {
        super(age, color, weight);
    }

    @Override
    public String getInfo(String owner) {
        return super.getInfo() + "onwer " + owner + "\n";
    }
}
