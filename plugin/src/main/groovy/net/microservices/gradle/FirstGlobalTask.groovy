package net.microservices.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project;

class FirstGlobalTask implements Plugin<Project> {

    @Override
    void apply(Project project) {

        def showDevicesTask = project.tasks.create("firstGlobalTask") << {
            println "Hi from templatePlugin plugin!"
        }
        showDevicesTask.group = "globalTasks"
        showDevicesTask.description = "Runs first global task"

    }
}