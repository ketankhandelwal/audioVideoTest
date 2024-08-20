pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter()
//        maven {
//            url = uri("https://maven.pkg.github.com/ketankhandelwal/AstroAudioVideoProject")
//            credentials {
//                username = "ketankhandelwal"
//            }
//        }
        maven {
            url = uri("https://jitpack.io")

        }
    }
}

rootProject.name = "finalTest"
include(":app")







 