package staticFactory.copy1.impl;

import staticFactory.copy1.Factory;
import staticFactory.copy1.Result.HKResult;
import staticFactory.copy1.Result.Result0;
import staticFactory.copy1.Service;
import staticFactory.copy1.Type0;

public class HKService implements Service {
    @Override
    public void register(Factory factory) {
        factory.register(Type0.HK,this);
    }

    @Override
    public Result0 getResult0() {
        return new HKResult.Builder().c(1).d(2).build();
    }
}
