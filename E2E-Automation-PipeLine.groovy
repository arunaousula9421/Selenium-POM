node {
   stage('Git checkout') { // for display purposes
      git 'https://github.com/arunaousula9421/Selenium-POM.git'
   }
   stage('UI') {
        try {
            sh "mvn test -Dbrowser=chrome
        } catch (err) {
            
        } 
   }
}
