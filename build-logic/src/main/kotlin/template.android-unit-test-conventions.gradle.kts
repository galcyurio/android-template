import core.libs

dependencies {
    add("testImplementation", libs.findLibrary("junit4").get())
    add("testImplementation", libs.findLibrary("truth").get())
}
