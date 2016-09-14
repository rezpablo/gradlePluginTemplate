package com.code4reference.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project;

class Code4ReferencePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        def showDevicesTask = project.tasks.create("c4rTask") << {
            println "Hi from Code4Reference plugin!"
        }
        showDevicesTask.group = "c4rTask"
        showDevicesTask.description = "Runs adb devices command"

    }
}