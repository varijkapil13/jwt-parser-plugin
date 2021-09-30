package com.github.varijkapil13.jwtparserplugin.services

import com.intellij.openapi.project.Project
import com.github.varijkapil13.jwtparserplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
