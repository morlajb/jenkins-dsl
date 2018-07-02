matrixJob('auto-example-mtx') {
    axes {
        text('DB', 'oracle','mysql')
        text ('OS' , 'RH5' , 'RH6')
    }
  
    wrappers {
        timestamps()
        timeout {
            absolute(10)
        }
    }

    steps {
        shell('echo DB : $DB , OS : $OS')
    }
}
