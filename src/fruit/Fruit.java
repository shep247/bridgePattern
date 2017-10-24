package fruit;

public abstract class Fruit {

    FruitImpl impl;

    public Fruit(FruitImpl impl){
        this.impl = impl;
    }

    protected abstract void eat();
}
