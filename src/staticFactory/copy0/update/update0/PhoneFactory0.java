package staticFactory.copy0.update.update0;


import java.util.HashMap;

public class PhoneFactory0 {
    private HashMap<Type,Phone0> hashMap = new HashMap<>();

    public void register(Type type,Phone0 phone0){
        hashMap.put(type,phone0);
    }

    public Phone0 getResult(Type type){
        return hashMap.get(type);
    }

//    public Phone0 create(String type){
//        if (type.equals("IPhone")){
//            return new IPhone0();
//        }else if (type.equals("MPhone")){
//            return new MPhone0();
//        }else
//            return null;
//    }
}