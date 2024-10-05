package staticFactory.copy1.impl;

import staticFactory.copy1.Factory;
import staticFactory.copy1.Result.GLSTResult;
import staticFactory.copy1.Result.Result0;
import staticFactory.copy1.Service;
import staticFactory.copy1.Type0;

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
