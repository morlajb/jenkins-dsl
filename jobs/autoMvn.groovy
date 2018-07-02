mavenJob('auto-maven') {
        logRotator(-1, 10)
        jdk('jdk-1.8.101')

        // jenkins-release.xml ID
        localRepository(LocalRepositoryLocation.LOCAL_TO_WORKSPACE)
        mavenInstallation('Maven-3.5.4')

        description ("""<p> <b>generate by DSL - DO NOT CHANGE Manually </b> <p>""")

        wrappers {
            timestamps()
            maskPasswords()

        }
  
          scm {
            git {
                remote {
                    url('git@github.com:morlajb/helloWorldMvn.git')
                    branch('*/master')
                    credentials('morlajb-github-demo')
                }

            }
          }
      goals('clean install')
}
