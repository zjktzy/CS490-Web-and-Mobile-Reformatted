# ICP11 README / WIKI

Description:

In this ICP I learned to use the basic android hardware functionality including Camera, Audio Recording, and Storage capability. <br>

#### Menu Output Screenshot

![menu_output](wiki_screenshots/menu_output.PNG)
notes: <br>
From this menu, users can access the different android hardware functionality. <br>

#### Camera Output Screenshot

![camera_output](wiki_screenshots/camera_output.PNG)

notes: <br>
Users can take an image and the application will give a preview.

#### Camera Java Screenshot

![CameraActivity_java](wiki_screenshots/CameraActivity_java.PNG)

notes: <br>
For this task I had to check if camera permission was enabled, if not I request permission. <br>

#### Recording Output Screenshot

![recording_output](wiki_screenshots/recording_output.PNG)

notes: <br>
This part of the app can record and playback audio. <br>

#### AudioRecording Java Screenshot

![AudioRecordingActivity_java](wiki_screenshots/AudioRecordingActivity_java.PNG)

notes: <br>
For this task I had to initialize a mediarecorder, set the audio source to microphone, and set a few audio properties. <br>

#### Storage Output Screenshot

![storage_output](wiki_screenshots/storage_output.PNG)

notes: <br>
The storage functionality will save user input text to a file and then display it back to the user after pressing the open button


#### Storage Java Screenshot

![StorageActivity_java](wiki_screenshots/StorageActivity_java.PNG)

notes: <br>
The saveTofile function will read what the user has input and write it to the file specified in the global variable FILENAME. <br>
The retrieveFromFile function is called when the user presses the "Open" button. This function will open the file at FILENAME, read that input into a string, and display it at the bottom of the page. <br>
