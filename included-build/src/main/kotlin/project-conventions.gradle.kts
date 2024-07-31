plugins {
    id("org.jetbrains.intellij.platform.base")
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity("2024.1")
        pluginVerifier()
    }
}

intellijPlatform {
    pluginVerification {
        ides {
            recommended()
        }
    }
}
