package com.github.ouronghuang.jetbrainstomato.services

import com.intellij.openapi.project.Project
import com.github.ouronghuang.jetbrainstomato.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
