package staticFactory.today.handler;

import staticFactory.today.Factory2;
import staticFactory.today.Handler2;
import staticFactory.today.Result.HKResult;
import staticFactory.today.Result.Result2;
import staticFactory.today.enums.Type2;

public class HKHandler2 implements Handler2 {
    @Override
    public void register(Factory2 factory2) {
        factory2.register(Type2.HK,this);
    }

    @Override
    public Result2 getResult() {
        return new HKResult();
    }
}
