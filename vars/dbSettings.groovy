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

    /* This Is Default Constructor */
    DBSetting(){
    }
     
    DBSetting(String workspace){
        this.workspace = workspace
    }

    @NonCPS
    void createSqlCommand(){
        String cmd = "${this.workspace}"
    }
}


def call(String workspace){
    DBSetting dbSetting = new DBSetting()
    return dbSetting.executeSqlCommand()
}