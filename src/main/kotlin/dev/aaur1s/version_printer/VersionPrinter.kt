package dev.aaur1s.version_printer

import org.gradle.api.Plugin
import org.gradle.api.Project

class VersionPrinter : Plugin<Project> {
    override fun apply(project: Project) {
        project.afterEvaluate {
            project.tasks.create("printVersion") {
                println(project.version)
            }
        }
    }
}