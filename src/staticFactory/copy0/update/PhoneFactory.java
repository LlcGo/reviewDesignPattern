package staticFactory.copy0.update;

public class PhoneFactory {
    public Phone create(String type){
        if (type.equals("IPhone")){
            return new IPhone();
        }else if (type.equals("MPhone")){
            return new MPhone();
        }else
            return null;
    }
}

