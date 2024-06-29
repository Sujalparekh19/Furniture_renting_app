
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.4" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
}

buildscript {
    repositories {
        google()
        // other repositories
    }
    dependencies {
        classpath("com.google.gms:google-services:4.3.10") // Check for the latest version
        // other dependencies
    }
}
