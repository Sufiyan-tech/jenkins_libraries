class DBSetting{
    String workspace
    String hostname
    String username
    String password 
    String port
    String dbname
    String filepath
    boolean is_parameterized
    Map parameters

     
    DBSetting(String workspace , String hostname , String username , String password , String port , String dbname , String filepath , boolean is_parameterized , Map parameters){
        this.workspace = workspace
        this.hostname = hostname
        this.username = username
        this.password = password
        this.port = port
        this.dbname = dbname
        this.filepath = filepath
        this.is_parameterized = is_parameterized
        this.parameters = parameters   
    }

    @NonCPS
    String createSqlCommand(){
        String cmd = "cd ${this.workspace}"
        return cmd
    }
}


def call(String workspace){
    DBSetting dbSetting = new DBSetting(workspace)
    return dbSetting.createSqlCommand()
}