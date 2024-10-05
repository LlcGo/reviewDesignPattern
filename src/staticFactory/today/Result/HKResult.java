package staticFactory.today.Result;

public class HKResult extends Result2{

    private String desc = "HK实体类";

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "HKResult{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
