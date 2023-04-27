pipeline{
agent any
stages {
stage ('Dev Stage') {
tools {
        maven "apache-maven-3.8.7"
      }
      steps {
        echo "This is the complie phase"
      }
    }
stage ('Testing stage'){
tools {
        maven "apache-maven-3.8.7"
      }
     
      steps {
        echo "This is the unit test phase"
        sh 'mvn test -DsuiteXml=testng-paralel.xml'
      }
}
stage ('PreProduction stage'){
tools {
        maven "apache-maven-3.8.7"
      }
      steps {
        echo "This is the PP phase"
              }
      }
stage ('Production stage'){
tools {
        maven "apache-maven-3.8.7"
      }
      steps {
        echo "This is the deploy stage"
      }
      }
}


}