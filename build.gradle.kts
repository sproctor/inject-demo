plugins{
    kotlin("multiplatform") version "1.9.0" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
}

tasks.wrapper {
    gradleVersion = "8.3"
}
