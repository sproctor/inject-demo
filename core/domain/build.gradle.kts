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
    jvm {
        withJava()
        testRuns.named("test") {
            executionTask.configure {
                useJUnitPlatform()
            }
        }
    }
    js {
        browser {
            commonWebpackConfig(Action {
                cssSupport {
                    enabled.set(true)
                }
            })
        }
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":core:common"))
                implementation(project(":core:data"))
                implementation("me.tatarka.inject:kotlin-inject-runtime:0.6.3")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
    }

    jvmToolchain(17)
}

dependencies {
    add("kspJvm", "me.tatarka.inject:kotlin-inject-compiler-ksp:0.6.3")
}