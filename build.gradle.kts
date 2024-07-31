plugins {
    id("project-conventions") apply false
}

subprojects {
    // moving this into the subprojects' plugins block fixes the issue
    plugins.apply("project-conventions")
}
