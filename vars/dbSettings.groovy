class DBSetting{
    String workspace
    final String hostname = "192.168.2.51"
    final String username = "UR_DEV"
    final String password = "UR_DEV"
    final String port = "5432"
    String dbname
    String filepath
    String filename
    boolean is_parameterized
    Map parameters

     
    DBSetting(String workspace , String dbname , String filepath , String filename , boolean is_parameterized , Map parameters){
        this.workspace = workspace
        this.dbname = dbname
        this.filepath = filepath
        this.filename = filename
        this.is_parameterized = is_parameterized
        this.parameters = parameters   
    }

    @NonCPS
    String createSqlCommand(){
        String cmd = "cd ${this.workspace+this.filepath}&& set PGPASSWORD=${this.password}&& psql -h ${this.hostname} -d ${this.dbname} -U ${this.username} -p ${this.port} -f ${this.filename}.sql"
        return cmd
    }
}


def call(String workspace , String dbname , String filepath , String filename , boolean is_parameterized , Map parameters){
    DBSetting dbSetting = new DBSetting(workspace , dbname , filepath , filename , is_parameterized , parameters)
    return dbSetting.createSqlCommand()
}