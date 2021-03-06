/**
 * Find which updates are available by running
 *     `$ ./gradlew syncLibs`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version. */
object Versions {
    const val appcompat: String = "1.0.2" 

    const val constraintlayout: String = "1.1.3" 

    const val androidx_core_core: String = "1.0.1" 

    const val lifecycle_livedata: String = "2.0.0" 

    const val jetifier_processor: String = "1.0.0-beta02" // exceed the version found: 0.0.1

    const val com_android_tools_build_gradle: String = "3.3.0"

    const val lint_gradle: String = "26.3.0" 

    const val android_maven_gradle_plugin: String = "2.1" 

    const val com_github_giacomoparisi_kotlin_functional_extensions: String =
            "4feba485ce" // No update information. Is this dependency available on jcenter or mavenCentral?

    const val gradle_bintray_plugin: String = "1.8.4" 

    const val io_arrow_kt: String =
            "0.8.2" // No update information. Is this dependency available on jcenter or mavenCentral?

    const val jmfayard_github_io_gradle_kotlin_dsl_libs_gradle_plugin: String = "0.2.6" 

    const val org_jetbrains_dokka: String = "0.9.17"

    const val org_jetbrains_kotlin: String = "1.3.11"

    const val org_jetbrains_kotlinx: String = "1.1.0" 

    /**
     *
     *   To update Gradle, edit the wrapper file at path:
     *      ./gradle/wrapper/gradle-wrapper.properties
     */
    object Gradle {
        const val runningVersion: String = "4.10.2"

        const val currentVersion: String = "5.1.1"

        const val nightlyVersion: String = "5.2-20190115022437+0000"

        const val releaseCandidate: String = ""
    }
}
