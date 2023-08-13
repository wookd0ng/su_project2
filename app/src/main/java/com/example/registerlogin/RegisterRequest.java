package com.example.registerlogin;




import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    //서버 URL 설정(PHP파일 연동)
    final static private String URL = "http://dong6135307.ivyro.net/Register.php";
    final private Map<String, String> map;

    public RegisterRequest(String userID, String userPass, String userName, int userAge, Response.Listener<String> listener){
        super(Method.POST,URL, listener,null);

        map=new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword",userPass);
        map.put("userName",userName);
        map.put("userAge", String.valueOf(userAge));

    }


    @Override
    protected Map<String, String> getParams(){
        return map;
    }
}
