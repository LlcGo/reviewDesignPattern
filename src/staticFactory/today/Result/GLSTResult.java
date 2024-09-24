package staticFactory.today.Result;

public class GLSTResult extends Result0{
    private Integer a;
    private Integer b;

    public GLSTResult(){}
    public GLSTResult(Builder builder){
        this.a = builder.a;
        this.b = builder.b;
    }

    public static class Builder{
        private Integer a;
        private Integer b;

        public Builder a(Integer a){
            this.a = a;
            return this;
        }

        public Builder b(Integer b){
            this.b = b;
            return this;
        }

        public GLSTResult build(){
            return new GLSTResult(this);
        }


    }

}
