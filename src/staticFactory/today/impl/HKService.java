package staticFactory.today.impl;

import staticFactory.today.Factory;
import staticFactory.today.Result.HKResult;
import staticFactory.today.Result.Result0;
import staticFactory.today.Service;
import staticFactory.today.Type0;

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
