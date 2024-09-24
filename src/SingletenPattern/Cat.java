package SingletenPattern;

public class Cat {

    private Cat(){};
    private static Cat cat;

    private String name;
    private String color;

    public void setName(String name){
        cat.name = name;
    }

    public void setColor(String color){
        cat.color = color;
    }
    public static Cat getCatInstance(){
        if(cat == null){
            synchronized (Cat.class){
                if (cat == null){
                    cat = new Cat();
                }
            }
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
