package lessons.patterns.decorator.Example;


public class TO implements IService {

    private int price = 300;
    private String description = "TO";

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
