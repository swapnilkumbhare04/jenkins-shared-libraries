def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh "docker bulid -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
