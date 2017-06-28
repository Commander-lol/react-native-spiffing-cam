
# react-native-spiffing-cam

## Getting started

`$ npm install react-native-spiffing-cam --save`

### Mostly automatic installation

`$ react-native link react-native-spiffing-cam`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-spiffing-cam` and add `LCSpiffingCam.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libLCSpiffingCam.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import co.louiscap.libs.spiffing.LCSpiffingCamPackage;` to the imports at the top of the file
  - Add `new LCSpiffingCamPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-spiffing-cam'
  	project(':react-native-spiffing-cam').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-spiffing-cam/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-spiffing-cam')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `LCSpiffingCam.sln` in `node_modules/react-native-spiffing-cam/windows/LCSpiffingCam.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Com.Reactlibrary.LCSpiffingCam;` to the usings at the top of the file
  - Add `new LCSpiffingCamPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import LCSpiffingCam from 'react-native-spiffing-cam';

// TODO: What to do with the module?
LCSpiffingCam;
```
  