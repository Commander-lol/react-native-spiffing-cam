package co.louiscap.libs.spiffing.camera;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.flurgle.camerakit.CameraView;
import com.facebook.react.uimanager.ThemedReactContext;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

public final class Camera extends FrameLayout {

	private final CameraView cameraView;

	public Camera(ThemedReactContext context) {
		super(context);
		this.cameraView = new CameraView(context);
	}

	@Override
	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		addView(cameraView, MATCH_PARENT, MATCH_PARENT);

	}

	@Override
	protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
	}
}
