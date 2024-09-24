package staticFactory.copy0;

import staticFactory.copy0.CJ.CJia;

import java.util.HashMap;

public class ConText {
    private static HashMap<CJia,SFService> hashMap = new HashMap<>();

    public  void register(CJia c,SFService sfService){
        hashMap.put(c,sfService);
    }

    public  SFService getSFService(CJia cJia){
        return hashMap.get(cJia);
    }
}
