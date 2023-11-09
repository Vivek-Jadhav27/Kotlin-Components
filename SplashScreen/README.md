
# Splash Screen #

To create a splash screen in Kotlin follow below steps

- Step 1: Add Images or logos in drawable
- Step 2: Add dependency in Gradle

    
        implementation("androidx.core:core-splashscreen:1.0.0")

- Step 3: Add colors in Colors.xml
- Step 4: Add Theme


        <style name="Theme.App.SplashScreen" parent="Theme.SplashScreen">
        <item name="windowSplashScreenBackground">@color/blue</ item>
        <item name="windowSplashScreenAnimatedIcon">@drawable/notify</item>
        <item name="postSplashScreenTheme">@style/Base.Theme.SplashScreen_1</item>
        </style>

- Step 5: Add them in Manifest.xml

        
        <activity
            android:name=".MainActivity"
            android:theme="@style/Theme.App.SplashScreen"
            android:exported="true">
        
- Step 6: Add code in MainActivity.kt

        class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(3000)
        installSplashScreen()

        setContentView(R.layout.activity_main)
            }
        }

<img src="https://github.com/Vivek-Jadhav27/Kotlin-Components-/assets/85949907/e80591f5-e34c-486a-baaa-95db0bf942ba" width="300" height="700">

<img src="https://github.com/Vivek-Jadhav27/Kotlin-Components-/assets/85949907/c222668c-fbd3-4aaf-8825-e3983083c179" width="300" height="700">

