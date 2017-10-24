package fruit.camping;

import fruit.FruitImpl;

public class CampingFruitImpl implements FruitImpl{
    @Override
    public void chop() {
        System.out.println("CAMP: chop fruit with pocket knife");
    }

    @Override
    public void squeeze() {
        System.out.println("CAMP: squeeze juice into plastic cup");
    }

    @Override
    public void eat() {
        System.out.println("CAMP: drink juice with tequila");
    }
}
