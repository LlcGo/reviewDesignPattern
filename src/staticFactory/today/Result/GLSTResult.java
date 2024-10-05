package staticFactory.today.Result;

public class GLSTResult extends Result2{

    private String desc = "GLST实体类";

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "GLSTResult{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
