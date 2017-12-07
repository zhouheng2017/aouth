package com.wx.auth.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

import com.wx.auth.util.AuthUtil;
@WebServlet("/wxLogin")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String backUrl = "http://11.0.34.153/callBack";//
        String backUrl = "http://j33pdu.natappfree.cc/wxCallBack";//
        String url ="https://open.weixin.qq.com/connect/oauth2/authorize?appid="+AuthUtil.APPID
                +"&redirect_uri="+URLEncoder.encode(backUrl)
                +"&response_type=code"
                +"&scope=snsapi_userinfo"
                +"&state=STATE#wechat_redirect";

        resp.sendRedirect(url);
//        super.doGet(req, resp);
    }
}
