import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    application
}

group = "dev.bettercoding"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "17"
}

application {
    mainClass.set("MainKt")
}
