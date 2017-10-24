package fruit;

public class DomesticFruit extends Fruit{

    public DomesticFruit(FruitImpl impl) {
        super(impl);
    }

    @Override
    protected void eat() {
        impl.eat();
    }

    public void prepare(){
        impl.chop();
        eat();
    }
}
