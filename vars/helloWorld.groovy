class TestClass{
    String mes

    public TestClass(String mes){
        this.mes = mes
    }

    public String getMessage(){
        return this.mes
    }

}

def call(Map config = [:]){
    TestClass tc = new TestClass("Good Morning")
    config.description = tc.getMessage()
    bat "echo hello ${config.name} and ${config.description}"
}