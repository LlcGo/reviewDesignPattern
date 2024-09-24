package staticFactory.copy0;

import staticFactory.copy0.CJ.CJia;
import staticFactory.copy0.CJ.GLSTService;
import staticFactory.copy0.CJ.HKService;
import staticFactory.copy0.Result.Answer;

public class TestMain {
    public static void main(String[] args) {
        ConText conText = new ConText();
        GLSTService glstService = new GLSTService();
        glstService.register(conText);

        HKService hkService = new HKService();
        hkService.register(conText);

        Answer sfResult = conText.getSFService(CJia.HK).getSFResult();
        Answer sfService = conText.getSFService(CJia.GLST).getSFResult();
        System.out.println(sfService);
        System.out.println(sfResult);
    }
}
