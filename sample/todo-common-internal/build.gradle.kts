import com.arkivanov.gradle.Target
import com.arkivanov.gradle.kotlin
import com.arkivanov.gradle.setupMultiplatform

setupMultiplatform(Target.Android, Target.Js(mode = Target.Js.Mode.IR), Target.Ios)

kotlin {
    sourceSets {
        named("commonMain") {
            dependencies {
                implementation(project(":mvikotlin"))
                api(project(":sample:todo-common"))
            }
        }
    }
}