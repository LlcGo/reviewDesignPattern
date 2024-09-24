package SingletenPattern.test0;

public class TestDog {
    public static void main(String[] args) {
        Dog instance = Dog.getInstance();
        instance.setName("汪汪");
        System.out.println(instance);

        Dog instance1 = Dog.getInstance();
        System.out.println(instance1);
        System.out.println(instance1 == instance);
    }
}
