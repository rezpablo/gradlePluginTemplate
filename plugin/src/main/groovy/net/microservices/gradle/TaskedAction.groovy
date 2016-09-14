package net.microservices.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class TaskedAction extends DefaultTask {

    @TaskAction
    void initialTask() {

        println "Hello from initialTask"
    }
}
