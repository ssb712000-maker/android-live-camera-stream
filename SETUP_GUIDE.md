# Setup Guide for Android Live Camera Stream

## Prerequisites
Before starting the setup process, ensure you have the following installed:
- **Android Studio**: Make sure you have the latest version of Android Studio installed on your machine.
- **Java Development Kit (JDK)**: Install JDK version 8 or higher.
- **Android SDK**: Ensure you have the appropriate SDK packages downloaded for your target Android version.

## Clone the Repository
To get started, clone the repository to your local machine using the following command:
```bash
git clone https://github.com/ssb712000-maker/android-live-camera-stream.git
```

## Open the Project
1. Launch Android Studio.
2. Click on `Open an existing Android Studio project`.
3. Navigate to the directory where you cloned the repository and select it.
4. Wait for Android Studio to sync the project.

## Configure Build Variants
1. Go to `Build Variants` (on the left panel).
2. Choose the appropriate variant for your project (e.g., `debug` or `release`).

## Running the App
1. Connect your Android device or start an emulator.
2. Click on the green "Run" button in the toolbar or press `Shift + F10`.
3. Select your device from the list.
4. Monitor the logcat for any runtime errors or warnings.

## Additional Setup (if required)
- **Permissions**: Ensure your app has the necessary permissions added to `AndroidManifest.xml` for accessing camera and internet features.
- **Dependencies**: If there are additional dependencies mentioned in the `build.gradle` file, sync them if prompted.

## Troubleshooting
- If you encounter issues, check your logcat for errors and ensure all dependencies are correctly set up.
- Refer to the [official Android documentation](https://developer.android.com/docs) for help with any Android-specific issues.

## Conclusion
You have successfully set up the Android Live Camera Stream application. Enjoy streaming!