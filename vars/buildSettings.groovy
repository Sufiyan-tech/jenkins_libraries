class BuildSettings{
    int buildNo
    String buildName
    String buildDescription
    int currentBuildNo

    public BuildSettings(int buildNo , currentBuildNo){
        this.currentBuildNo = currentBuildNo
    }

    public void setBuildSettings(){
        switch(this.buildNo){
            case 0:
                this.buildName = "Sufiyan Zero Build"
                this.buildDescription = "Sufiyan Zero Description"
                break
            case {build > 0}:
                this.buildName = "Sufiyan Positive Build"
                this.buildDescription = "Sufiyan Positive Description"
                break
            case {build < 0}:
                this.buildName = "Sufiyan Negative Build"
                this.buildDescription = "Sufiyan Negative Description"        
                break
            default:
                this.buildName = "Sufiyan "+this.currentBuildNo+" Build"
                this.buildDescription = "Sufiyan "+this.currentBuildNo+" Description"        
                break

        }
    }

}


def call(int buildNo){
    BuildSettings bSetting = new BuildSettings(buildNo , currentBuild.number)
    bSetting.setBuildSettings()
    currentBuild.displayName = bSetting.name
    currentBuild.description = bSetting.description
}