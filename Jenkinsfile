job('DSL-Tutorial-1-Test') {
    scm {
        git('https://github.com/pushparampura/hello-world/')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven('-e clean test package')
    }
}
