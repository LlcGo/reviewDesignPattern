package template.today;

import java.util.HashMap;

public class Factory1 {

    private static HashMap<Type1,Template1> hashMap = new HashMap<Type1,Template1>(){{
        put(Type1.GLST,new Test1());
        put(Type1.HK,new Test2());
    }};

    public static Template1 getTemplate(Type1 type1){
        return hashMap.get(type1);
    }

}
