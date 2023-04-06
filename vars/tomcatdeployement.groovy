def call (){
sshagent(['tomcat']){
       sh "scp -o StrictHostKeyChecking=no  target/*.war kavi@20.238.61.90:/opt/tomcat9/webapps"
       sh "ssh kavi@20.238.61.90 sudo /opt/tomcat9/bin/shutdown.sh"
       sh "ssh kavi@20.238.61.90 sudo /opt/tomcat9/bin/startup.sh"
                     
     }
}
