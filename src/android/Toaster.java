import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import android.provider.Settings;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Toaster extends CordovaPlugin {

  public static final String TAG = "Toaster";

  public Toaster() {}

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);
  }

  public boolean execute(final String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

    final int duration = Toast.LENGTH_SHORT;

    cordova.getActivity().runOnUiThread(new Runnable() {
      public void run() {
        Toast toast = Toast.makeText(cordova.getActivity().getApplicationContext(), action, duration);
        toast.show();
      }
    });

    return true;
  }
}
