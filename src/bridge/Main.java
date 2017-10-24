package bridge;

import fruit.BlackBerry;
import fruit.DomesticFruit;
import fruit.TropicalFruit;
import fruit.atHome.AtHomeFruitImpl;
import fruit.camping.CampingFruitImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        TropicalFruit tropicalCamping = new TropicalFruit(new CampingFruitImpl());
        DomesticFruit domesticCamping = new DomesticFruit(new CampingFruitImpl());
        TropicalFruit tropicalAtHome = new TropicalFruit(new AtHomeFruitImpl());
        DomesticFruit domesticAtHome = new DomesticFruit(new AtHomeFruitImpl());

        tropicalAtHome.savorTheFruit();
        domesticAtHome.prepare();

        tropicalCamping.savorTheFruit();
        domesticCamping.prepare();

        BlackBerry blackBerryAtHome = new BlackBerry(new AtHomeFruitImpl());
        blackBerryAtHome.deseed();
    }
}
