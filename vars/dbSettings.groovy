class DBSetting{
    String workspace
    String hostname
    String username
    String password 
    String port
    String dbname
    String file
    boolean is_parameterized
    def parameters = [:]

    DBSetting(String workspace= "C:/"){
        this.workspace = workspace
    }

    @NonCPS
    String createSqlCommand(){
        String cmd = "cd ${this.workspace}"
        return cmd
    }
}


def call(String workspace){
    DBSetting dbSetting = new DBSetting()
    return dbSetting.createSqlCommand()
}