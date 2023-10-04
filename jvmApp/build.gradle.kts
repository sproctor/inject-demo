plugins {
    kotlin("jvm")
    id("com.google.devtools.ksp")
    application
}

group = "com.seanproctor"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("com.seanproctor.demo.MainKt")
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:data"))
    implementation(project(":core:domain"))
    implementation(project(":core:view"))
}
