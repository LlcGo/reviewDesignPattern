package staticFactory.today.Result;

public class HKResult extends Result0{
    private Integer c;
    private Integer d;
    public HKResult(){};

    public HKResult(Builder builder){
        this.c = builder.c;
        this.d = builder.d;
    }

    public static class Builder{
        private Integer c;
        private Integer d;

        public Builder c(Integer c){
            this.c = c;
            return this;
        }

        public Builder d(Integer d){
            this.d = d;
            return this;
        }

        public HKResult build(){
            return new HKResult(this);
        }
    }

}
