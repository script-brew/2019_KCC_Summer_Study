package com.kcc.kccm_project.logic;

import android.os.AsyncTask;

import com.kcc.kccm_project.service.SignService;
import com.kcc.kccm_project.util.RequestUtil;

import org.json.JSONException;
import org.json.JSONObject;

public class SignLogic implements SignService {
    private String response;
    private String url = "https://us-central1-mobile-kcc.cloudfunctions.net/signup";
    @Override
    public String signUp(String id, String password, String name, String birthday) {
        try {
            JSONObject userInfoObject = new JSONObject();
            JSONObject requestObject = new JSONObject();
            userInfoObject.put("user_id", id);
            userInfoObject.put("user_pw", password);
            userInfoObject.put("user_name", name);
            userInfoObject.put("user_birthday", birthday);

            requestObject.put("user_info", userInfoObject);

            NetworkTask networkTask = new NetworkTask(url, requestObject.toString());
            networkTask.execute();
            Thread.sleep(1000);
        } catch(JSONException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return response;
    }

    @Override
    public String signIn(String id, String password) {
        return null;
    }

    public class NetworkTask extends AsyncTask<Void, Void, String> {
        String url;
        String value;

        public NetworkTask(String url, String value) {
            this.url = url;
            this.value = value;
        }

        @Override
        protected String doInBackground(Void... params) {
            RequestUtil requestUtil = new RequestUtil();
            response = requestUtil.request(url, value);

            return response;
        }

        @Override
        protected void  onPostExecute(String value) {
            super.onPostExecute(value);
        }
    }
}
