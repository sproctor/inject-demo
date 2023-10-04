pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "demo"

include(":core:common")
include(":core:data")
include(":core:domain")
include(":core:view")
//include(":core:database")
include(":jvmApp")