package staticFactory.copy0.update.update0;

public class Test {

    public static final String IPhone = "IPhone";

    public static final String MPhone = "MPhone";

    public static void main(String[] args) {
//        // 生产小米手机
//        PhoneFactory0 factory1 = new PhoneFactory0();
//        factory1.create(MPhone).call();
//
//        // 生产苹果手机
//        PhoneFactory0 factory2 = new PhoneFactory0();
//        factory2.create(IPhone).call();
        PhoneFactory0 phoneFactory0 = new PhoneFactory0();
        IPhone0 iPhone0 = new IPhone0();
        iPhone0.register(phoneFactory0);
        MPhone0 mPhone0 = new MPhone0();
        mPhone0.register(phoneFactory0);

        phoneFactory0.getResult(Type.IPHONE).call();
        phoneFactory0.getResult(Type.MPHONE).call();

    }
}
