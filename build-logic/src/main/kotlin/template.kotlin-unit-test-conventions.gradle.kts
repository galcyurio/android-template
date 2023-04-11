import core.libs

dependencies {
    add("testImplementation", libs.findLibrary("junit5").get())
    add("testImplementation", libs.findLibrary("truth").get())
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
