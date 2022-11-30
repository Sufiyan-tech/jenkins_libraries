class DBSetting{
    String workspace
    final String hostname = "192.168.2.51"
    final String username = "UR_DEV"
    final String password = "UR_DEV"
    final String port = "5432"
    final String dbname
    String filepath
    boolean is_parameterized
    Map parameters

     
    DBSetting(String workspace , String dbname , String filepath , boolean is_parameterized , Map parameters){
        this.workspace = workspace
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


def call(String workspace , String dbname , String filepath , boolean is_parameterized , Map parameters){
    DBSetting dbSetting = new DBSetting(workspace , String dbname , String filepath , boolean is_parameterized , Map parameters)
    return dbSetting.createSqlCommand()
}