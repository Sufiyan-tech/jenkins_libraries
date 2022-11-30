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
     
    DBSetting(String workspace = "${WORKSPACE}"){
        this.workspace = workspace
    }

    void executeSqlCommand(){
        println this.workspace
    }
}


def call(){
    DBSetting dbSetting = new DBSetting()
    dbSetting.executeSqlCommand()
}