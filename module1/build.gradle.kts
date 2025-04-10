group = rootProject.group
version = rootProject.version


plugins {
    kotlin("jvm")
}
tasks.test {
    useJUnitPlatform()
}
dependencies {
    implementation(project(":module2"))
    testImplementation(libs.junit.jupiter)
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}
