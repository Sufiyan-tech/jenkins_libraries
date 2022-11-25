class BuildSetting{
    int buildNo
    String buildName
    String buildDescription
    int currentBuildNo

    public BuildSetting(int buildNo , currentBuildNo){
        this.currentBuildNo = currentBuildNo
        this.setBuildSetting()
    }

    @NonCPS
    public void setBuildSetting(){
        switch(this.buildNo){
            case 0:{
                this.buildName = "Sufiyan Zero Build"
                this.buildDescription = "Sufiyan Zero Description"
                break
            }
            case {this.buildNo > 0}:{
                this.buildName = "Sufiyan Positive Build"
                this.buildDescription = "Sufiyan Positive Description"
                break
            }
            case {this.buildNo < 0}:{
                this.buildName = "Sufiyan Negative Build"
                this.buildDescription = "Sufiyan Negative Description"        
                break
            }
            default:{
                this.buildName = "Sufiyan "+this.currentBuildNo+" Build"
                this.buildDescription = "Sufiyan "+this.currentBuildNo+" Description"        
                break
            }

        }
    }

}


def call(int buildNo){
    BuildSetting bSetting = new BuildSetting(buildNo , currentBuild.number)
    currentBuild.displayName = bSetting.buildName
    currentBuild.description = bSetting.buildDescription
}