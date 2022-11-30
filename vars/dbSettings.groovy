class DBSetting{
    String workspace
    String final hostname = "192.168.2.51"
    String final username = "UR_DEV"
    String final password = "UR_DEV"
    String final port = "5432"
    String dbname
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


def call(String workspace){
    DBSetting dbSetting = new DBSetting(workspace)
    return dbSetting.createSqlCommand()
}