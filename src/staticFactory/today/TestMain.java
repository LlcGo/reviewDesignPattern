package staticFactory.today;

import staticFactory.today.Result.GLSTResult;
import staticFactory.today.Result.HKResult;
import staticFactory.today.Result.Result2;
import staticFactory.today.enums.Type2;
import staticFactory.today.handler.GLSTHandler2;
import staticFactory.today.handler.HKHandler2;

public class TestMain {
    public static void main(String[] args) {
        // 依赖注入
        Factory2 factory2 = new Factory2();
        HKHandler2 hkHandler2 = new HKHandler2();
        GLSTHandler2 glstHandler2 = new GLSTHandler2();
        hkHandler2.register(factory2);
        glstHandler2.register(factory2);

        // 使用
        Result2 glstResult = factory2.getService(Type2.HK).getResult();
        System.out.println(glstResult);
        Result2 hkResult = factory2.getService(Type2.GLST).getResult();
        System.out.println(hkResult);
    }
}
