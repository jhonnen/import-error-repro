import org.jetbrains.intellij.platform.gradle.extensions.intellijPlatform

pluginManagement {
    includeBuild("included-build")
}
plugins {
    id("org.jetbrains.intellij.platform.settings") version "2.0.0"
}

rootProject.name = "import-error-repro"


include(":subproject")

dependencyResolutionManagement {
    repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS

    repositories {
        mavenCentral()
        intellijPlatform {
            defaultRepositories()
        }
    }
}
