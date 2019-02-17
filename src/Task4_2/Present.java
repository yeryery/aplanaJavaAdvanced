package Task4_2;

public class Present {
    private String name;
    private int weight;
    private int price;
    private String parameter;

    public Present(String name,  int weight, int price,String parameter) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.parameter = parameter;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getParameter() {
        return parameter;
    }

    @Override
    public String toString() {
        return "Name: '" + this.getName() + "', Weight: '" + this.getWeight() + "', Price: '" + this.getPrice() + "', " +
                "Parameter: '" + this.getParameter() + "'";
    }
}
