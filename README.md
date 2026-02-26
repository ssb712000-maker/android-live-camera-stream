# Android Live Camera Stream

## Overview
This project provides an Android app for live camera streaming using modern technology. It allows users to stream video from their device's camera to a remote server or peer devices.

## Features
- Live streaming of video feed
- Supports multiple resolutions and bitrates
- User-friendly interface
- Real-time statistics on streaming performance

## Prerequisites
- Android Studio
- Basic understanding of Android development
- A server capable of receiving streams (e.g., a media server)

## Installation
1. Clone this repository:
   ```bash
   git clone https://github.com/ssb712000-maker/android-live-camera-stream.git
   cd android-live-camera-stream
   ```

2. Open the project in Android Studio.

3. Configure the necessary permissions in your `AndroidManifest.xml`:
   ```xml
   <uses-permission android:name="android.permission.CAMERA" />  
   <uses-permission android:name="android.permission.INTERNET" />
   ```

4. Implement your server configurations in the app's settings.

## Getting Started
1. Launch the app on your Android device.
2. Select camera settings (resolution, bitrate).
3. Start the streaming.

## Code Structure
- `MainActivity.java`: The main entry point for the app.
- `CameraStreamingService.java`: Handles the camera streaming functionalities.

## Contributing
Contributions are welcome! Please submit a pull request or open an issue to discuss improvements.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
For any inquiries, please reach out to ssb712000-maker@example.com.