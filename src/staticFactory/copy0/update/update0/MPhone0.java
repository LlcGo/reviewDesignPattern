package staticFactory.copy0.update.update0;

public class MPhone0 implements Phone0 {
    @Override
    public void register(PhoneFactory0 factory0) {
        factory0.register(Type.MPHONE,this);
    }

    @Override
    public void call() {
        System.out.println("用小米手机打电话！");
    }
}