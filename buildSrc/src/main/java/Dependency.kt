object Dependency {
    object AndroidX {
        const val CORE_KTX = "androidx.core:core-ktx:${Versions.AndroidX.CORE_KTX}"
        const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.AndroidX.APPCOMPAT}"
        const val CONSTRAINT_LAYOUT =
            "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.CONSTRAINT_LAYOUT}"
        const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${Versions.AndroidX.ACTIVITY_KTX}"
        const val FRAGMENT = "androidx.fragment:fragment-ktx:1.3.4"
        const val VIEMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0"
    }
    object Google {
        const val METARIAL = "com.google.android.material:material:${Versions.Google.METARIAL}"
    }
    object Test {
        const val JUNIT = "junit:junit:${Versions.Test.JUNIT}"
        const val ANDROIDX_JUNIT = "androidx.test.ext:junit:${Versions.Test.ANDROIDX_JUNIT}"
        const val ANDROID_ESPRESSO =
            "androidx.test.espresso:espresso-core:${Versions.Test.ANDROID_ESPRESSO}"
    }
}