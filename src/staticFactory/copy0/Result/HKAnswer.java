package staticFactory.copy0.Result;

public class HKAnswer extends Answer {

    private String answer;

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getAnswer(){
        return this.answer;
    }

    @Override
    public String toString() {
        return "GLSTAnswer{" +
                "answer='" + answer + '\'' +
                '}';
    }
}
