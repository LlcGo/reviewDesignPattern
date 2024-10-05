package staticFactory.today;

import staticFactory.today.enums.Type2;

import java.util.HashMap;

public class Factory2 {

    private HashMap<Type2,Handler2> hashMap = new HashMap<Type2, Handler2>();

    public void register(Type2 type2,Handler2 handler2){
        hashMap.put(type2,handler2);
    }

    public Handler2 getService(Type2 type2){
        return hashMap.get(type2);
    }

}
