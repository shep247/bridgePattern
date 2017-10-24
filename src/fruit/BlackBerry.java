package fruit;

public class BlackBerry extends Berry{
    public BlackBerry(FruitImpl impl) {
        super(impl);
    }

    public void deseed(){
        impl.squeeze();
    }

    @Override
    protected void eat(){
        impl.eat();
    }
}
