package staticFactory.today.impl;

import staticFactory.today.Factory;
import staticFactory.today.Result.GLSTResult;
import staticFactory.today.Result.Result0;
import staticFactory.today.Service;
import staticFactory.today.Type0;

public class GLSTService implements Service {
    @Override
    public void register(Factory factory) {
        factory.register(Type0.GLST,this);
    }

    @Override
    public Result0 getResult0() {
       return new GLSTResult.Builder().b(1).a(2).build();
    }
}
