plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.atlasv.android.plugin.publishlib")
}
android {
    compileSdk = 35

    defaultConfig {
        minSdk = 24
        consumerProguardFiles("consumer-proguard-rules.pro")
    }
    namespace = "timber.log"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    api("org.jetbrains.kotlin:kotlin-stdlib:2.0.21")
}
