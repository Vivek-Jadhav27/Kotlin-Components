# Splash Screen #

To create a splash screen in Kotlin follow below steps

- Step 1: Add Images or logos in drawable
- Step 2: Add dependency in Gradle
  <br>  <br>

    implementation("androidx.core:core-splashscreen:1.0.0")
- Step 3: Add colors in Colors.xml
- Step 4: Add Theme
<br> <br>

<style name="Theme.App.SplashScreen" parent="Theme.SplashScreen">
        <item name="windowSplashScreenBackground">@color/blue</item>
        <item name="windowSplashScreenAnimatedIcon">@drawable/notify</item>
        <item name="postSplashScreenTheme">@style/Base.Theme.SplashScreen_1</item>
</style>

- Step 5: Add them in Manifest.xml
<br> <br>
  <activity
            android:name=".MainActivity"
            android:theme="@style/Theme.App.SplashScreen"
            android:exported="true">

- Step 6: Add code in MainActivity.kt
<br> <br>
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()

        setContentView(R.layout.activity_main)
    }
}
