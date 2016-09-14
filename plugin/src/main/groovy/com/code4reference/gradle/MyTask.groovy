package com.code4reference.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class MyTask extends DefaultTask {

    @TaskAction
    void javaTask() {

        println "Hello from MyJavaTask"
    }
}
