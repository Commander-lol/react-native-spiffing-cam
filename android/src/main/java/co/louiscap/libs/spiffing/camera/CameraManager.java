package co.louiscap.libs.spiffing.camera;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class CameraManager extends SimpleViewManager<Camera> {
	public static final String REACT_CLASS = "LCSpiffingCam";

	@Override
	public String getName() {
		return REACT_CLASS;
	}

	@Override
	public Camera createViewInstance(ThemedReactContext context) {
		return new Camera(context);
	}
}
