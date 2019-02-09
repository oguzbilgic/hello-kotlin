plugins {
    application
    kotlin("jvm") version "1.3.21"
}

application {
    mainClassName = "hellokotlin.MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
  compile(kotlin("stdlib", "1.3.11"))
}
