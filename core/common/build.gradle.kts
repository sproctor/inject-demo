plugins {
    kotlin("multiplatform")
    id("com.google.devtools.ksp")
}

group = "com.seanproctor"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
                implementation("me.tatarka.inject:kotlin-inject-runtime:0.6.3")
            }
        }
    }

    jvmToolchain(17)
}

dependencies {
    add("kspJvm", "me.tatarka.inject:kotlin-inject-compiler-ksp:0.6.3")
}