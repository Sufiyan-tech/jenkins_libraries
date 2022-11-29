def call(){
    def command = ["cd C:\\URebal\\UR-PRO-Backend\\src\\DB Scripts\\Blueleaf && set PGPASSWORD=UR_DEV&& psql -h 192.168.2.51 -d check-db -U UR_DEV -f CreateFirm.sql"];
    command.execute();
}