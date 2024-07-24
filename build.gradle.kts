plugins {
    kotlin("multiplatform") version "2.0.0"
}

repositories {
    mavenCentral()
}

kotlin {
    linuxX64("native") {
        binaries {
            executable()
        }
    }
    // TODO: ...
    // macosX64("native") {}
}

tasks.withType<Wrapper> {
    gradleVersion = "8.5"
    distributionType = Wrapper.DistributionType.BIN
}
