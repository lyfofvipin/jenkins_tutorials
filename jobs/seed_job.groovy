folder('test_folder') // This will create a folder first
job("test_folder/test_freestyle_job"){
    steps {
        shell('echo Hello World!')
    }
}

pipelineJob('test_folder/test_pipeline_job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/lyfofvipin/jenkins_tutorials.git')
                    }
                    branches("master")
                }
            }
            scriptPath('jobs/First_Jenkinsfile')
        }
    }
}
