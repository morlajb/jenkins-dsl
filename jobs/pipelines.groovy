String[] repos =
    ['HelloWorldGradle']
     
for (int i = 0; i < repos.length; i++) {
    repoName = repos[i];
  
    multibranchPipelineJob('auto-PIPELINE-'+repoName) {
        branchSources {
            git {
                remote('git@github.com:morlajb/'+repoName+'.git')
                credentialsId('morlajb-github-demo')
            }
        }
        description ("""<p> <b>generate by DSL - DO NOT CHANGE Manually </b> <p>""")
        triggers {
            periodic(2)
        }
        orphanedItemStrategy {
            discardOldItems {
                numToKeep(0)
                daysToKeep(0)
            }
        }
    }
}
