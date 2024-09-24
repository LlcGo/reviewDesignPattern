package staticFactory.copy0.CJ;

import staticFactory.copy0.Result.Answer;
import staticFactory.copy0.ConText;
import staticFactory.copy0.Result.HKAnswer;
import staticFactory.copy0.SFService;

public class HKService implements SFService {

    @Override
    public void register(ConText conText) {
        conText.register(CJia.HK,this);
    }

    @Override
    public Answer getSFResult() {
        HKAnswer hkAnswer = new HKAnswer();
        hkAnswer.setAnswer("HK答案");
        return hkAnswer;
    }
}
