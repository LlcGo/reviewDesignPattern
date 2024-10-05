package staticFactory.copy1;

import staticFactory.copy1.Result.Result0;
import staticFactory.copy1.impl.GLSTService;
import staticFactory.copy1.impl.HKService;

public class TestMain {
    public static void main(String[] args) {
        Factory factory = new Factory();
        GLSTService glstService = new GLSTService();
        glstService.register(factory);
        HKService hkService = new HKService();
        hkService.register(factory);

        Result0 result0 = factory.getService(Type0.GLST).getResult0();
        System.out.println(result0);
        Result0 result01 = factory.getService(Type0.HK).getResult0();
        System.out.println(result01);
    }
}
