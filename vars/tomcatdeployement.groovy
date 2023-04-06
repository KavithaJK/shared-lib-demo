def call (user,ip){
sshagent(['tomcat']){
       sh "scp -o StrictHostKeyChecking=no  target/*.war ${user}@${ip}:/opt/tomcat9/webapps"
       sh "ssh ${user}@${ip} sudo /opt/tomcat9/bin/shutdown.sh"
       sh "ssh ${user}@${ip} sudo /opt/tomcat9/bin/startup.sh"
                     
     }
}
