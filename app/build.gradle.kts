plugins {
    id("template.android-app-conventions") // TODO: replace with your project name
    id("template.kotlin-unit-test-conventions")
}

android {
    namespace = "com.github.galcyurio.template" // TODO: replace with your project name

    defaultConfig {
        applicationId = "com.github.galcyurio.template" // TODO: replace with your project name
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.material)
}
