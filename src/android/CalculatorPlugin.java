package cordova.plugin.calculator.CalculatorPlugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class CalculatorPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        int firstNum = args.getInt(0);
        int secondNum = args.getInt(1);
        if(action.equals("add")) {
            int res1 = firstNum+secondNum;
            String mes1 = Integer.toString(res1);
            this.sendResponeToUI(mes1, callbackContext);
            return true;
        }else if (action.equals("sub")) {
            int res2 = firstNum-secondNum;
            String mes2 = Integer.toString(res2);
            this.sendResponeToUI(mes2, callbackContext);
            return true;
        }else if (action.equals("mul")) {
            int res3 = firstNum*secondNum;
            String mes3 = Integer.toString(res3);
            this.sendResponeToUI(mes3, callbackContext);
            return true;
        }else if (action.equals("div")) {
            int res4 = firstNum/secondNum;
            String mes4 = Integer.toString(res4);
            this.sendResponeToUI(mes4, callbackContext);
            return true;
        }

        return false;
    }

    private void sendResponeToUI(String reponseResult, CallbackContext callbackContext) {
        if (reponseResult != null && reponseResult.length() > 0) {
            callbackContext.success(reponseResult);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
