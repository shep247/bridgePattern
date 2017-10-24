package fruit.atHome;

import fruit.FruitImpl;

public class AtHomeFruitImpl implements FruitImpl{
    @Override
    public void chop() {
        System.out.println("AtHome: chop fruit with fancy knife");
    }

    @Override
    public void squeeze() {
        System.out.println("AtHome: squeeze juice into serving cup");
    }

    @Override
    public void eat() {
        System.out.println("AtHome: drink juice with children");
    }
}
