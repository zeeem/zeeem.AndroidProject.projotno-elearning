Build Instructions

	Install Android Studio (version 2.3.3)
	Install the latest JDK (8) from Oracle.
Make sure JAVA_HOME is set in your (PATH) environment matching the location of your Java installation.

	Clone the source repository from Git.

	To build a debug APK: 
Open a terminal/console/command prompt, 
change to the directory where you cloned Processing, and type:

gradlew assembleDebug

This creates an APK named module_name-debug.apk in project_name/App/build/outputs/apk/


	To install & run the built APK on emulator (using cmd): 

1.	navigate to android_sdk/tools/ and start the emulator by specifying your AVD:

emulator -avd avd_name

If you're unsure of the AVD name, execute emulator -list-avds.

2.	Now you can install your app using either the Gradle install tasks mentioned above or the adb tool:

adb install path/to/your_app.apk

All built APKs are saved in project_name/module_name/build/outputs/apk/.


	To install & run the built APK on emulator (using 3rd party Emulators): 

1.	Download “NOX Android emulator” from https://www.bignox.com/ and install it.
2.	Start the emulator from desktop icon.
3.	Drag and drop the built apk on the emulator.
