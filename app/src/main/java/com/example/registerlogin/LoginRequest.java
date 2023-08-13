package com.example.registerlogin;




import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {

    //서버 URL 설정(PHP 파일 연동)
    final static private String URL = "http://dong6135307.ivyro.net/Login.php";
    final private Map<String, String> map;

    public LoginRequest(String userID, String userPassword,Response.Listener<String> listener){
        super(Method.POST, URL, listener,null);

        map=new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword",userPassword);


    }


    @Override
    protected Map<String, String> getParams(){
        return map;
    }
}
