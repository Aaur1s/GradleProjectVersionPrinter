plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("maven-publish")
    id("com.gradle.plugin-publish") version "1.+"
    kotlin("jvm") version "1.9.10"
}

group = "dev.aaur1s"
version = "1.0"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(gradleApi())
}

java.toolchain.languageVersion.set(JavaLanguageVersion.of(8))

gradlePlugin {
    website.set("https://github.com/Aaur1s")
    vcsUrl.set("https://github.com/Aaur1s/GradleProjectVersionPrinter")
    val declaration by plugins.creating {
        id = "$group.project-version-printer"
        implementationClass = "dev.aaur1s.version_printer.VersionPrinter"
        version = "1.0"
        description = "Gradle Plugin that adds task `printVersion` that prints project version before build"
        displayName = "Project Version Printer"
        tags.addAll("version", "project", "print")
    }
}