package template.today;

public class TestMain {
    public static void main(String[] args) {
        Template1 template0 = Factory1.getTemplate(Type1.HK);
        template0.run();

        Template1 template1 = Factory1.getTemplate(Type1.GLST);
        template1.run();
    }
}
