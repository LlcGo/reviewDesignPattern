package SingletenPattern.test0;

public class Dog {

    private static Dog dog;

    private String name;

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    private Dog(){};

    public static Dog getInstance(){
        if(dog == null){
            synchronized(Dog.class){
                if (dog == null){
                    dog = new Dog();
                }
            }
        }
        return dog;
    }
}
