package template.today;

public abstract class Template1 {

    public void test1(){
        System.out.println("test1");
    }

    public void test2(){
        System.out.println("test2");
    }

    public abstract void go();

    public void run(){
        test1();
        go();
        test2();
    }

}
