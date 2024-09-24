package staticFactory.copy0.CJ;

import staticFactory.copy0.Result.Answer;
import staticFactory.copy0.ConText;
import staticFactory.copy0.Result.GLSTAnswer;
import staticFactory.copy0.SFService;

public class GLSTService implements SFService {

    @Override
    public void register(ConText conText) {
        conText.register(CJia.GLST,this);
    }

    @Override
    public Answer getSFResult() {
        GLSTAnswer glstAnswer = new GLSTAnswer();
        glstAnswer.setAnswer("GLST的答案");
        return glstAnswer;
    }

}
