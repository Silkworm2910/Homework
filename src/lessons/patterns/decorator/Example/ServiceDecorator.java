package lessons.patterns.decorator.Example;


public class ServiceDecorator implements IService {
    private IService service;

    public ServiceDecorator(IService service){
        this.service = service;
    }

    @Override
    public double getPrice() {
        return service.getPrice();
    }

    @Override
    public String getDescription() {
        return service.getDescription();
    }
}
