package fruit;

public class TropicalFruit extends Fruit {

    public TropicalFruit(FruitImpl impl){
        super(impl);
    }

    public void savorTheFruit(){
        impl.squeeze();
        eat();
    }

    @Override
    protected void eat(){
        impl.eat();
    }
}
