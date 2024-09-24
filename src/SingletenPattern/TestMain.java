package SingletenPattern;

public class TestMain {

    public static void main(String[] args) {
        Cat catInstance = Cat.getCatInstance();
        catInstance.setName("小猫");
        catInstance.setColor("棕色");
        System.out.println(catInstance);

        Cat catInstance1 = Cat.getCatInstance();
        System.out.println(catInstance1);

        catInstance1.setName("小猫");
        catInstance1.setColor("白色");
        System.out.println(catInstance1);

    }
}
