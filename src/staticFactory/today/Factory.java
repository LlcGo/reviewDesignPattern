package staticFactory.today;

import java.util.HashMap;

public class Factory {

    private HashMap<Type0,Service> hashMap = new HashMap<>();

    public void register(Type0 type0,Service service){
        hashMap.put(type0,service);
    }

    public Service getService(Type0 type0){
        return hashMap.get(type0);
    }

}
