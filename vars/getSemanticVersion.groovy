def call(Map config = [:]) {
        BASIC_VER = "1.0.0"
        def (breaking, feature, bugfix) = BASIC_VER.split('\\.')
        breaking = (breaking as int) + 1
        bugfix = (bugfix as int) + 1
        NEW_VER = "${breaking}.${feature}.${bugfix}"
        echo "${NEW_VER}"
    }