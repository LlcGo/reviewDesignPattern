package staticFactory.copy0.update.update0;

public class IPhone0 implements Phone0 {
    @Override
    public void register(PhoneFactory0 factory0) {
        factory0.register(Type.IPHONE,this);
    }

    @Override
    public void call() {
        System.out.println("用苹果手机打电话！");
    }
}