package com.wx.auth.util;

import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.DefaultHttpClientConnectionOperator;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;

public class AuthUtil {

    public static final  String APPID = "wx3d2d7a47bac38b65";
    public static final  String APPSECRET = "08bd7d73607178bb68764c245df1dfba";
    public static JSONObject doGetJson(String url) throws ClientProtocolException, IOException {

        JSONObject jsonObject = null;
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(url);
        HttpResponse response = client.execute(httpGet);
        HttpEntity entity = response.getEntity();



//        DefaultHttpClient client = new DefaultHttpClient();//初始化httpclenient对象
//        HttpGet httpGet = new HttpGet(url);//get方式进行提交
//
//        HttpResponse response = client.execute(httpGet);//通过httpclient方法发送请求
//        HttpEntity entity = response.getEntity();//获取想要的结果

        if (entity != null) {
            String result = EntityUtils.toString(entity, "UTF-8");
            jsonObject = JSONObject.fromObject(result);
        }

        httpGet.releaseConnection();


        return jsonObject;
    }
}
