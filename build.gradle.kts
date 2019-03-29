import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.21"
    idea
//    id("org.jlleitschuh.gradle.ktlint") version "6.3.1"
}

repositories {
    mavenCentral()
    jcenter()
}

val assertJVersion = "3.11.1"

dependencies {
    compile(kotlin("stdlib-jdk8"))
    testCompile(kotlin("test"))
    testCompile(kotlin("test-junit"))
    testCompile("org.assertj:assertj-core:$assertJVersion")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
