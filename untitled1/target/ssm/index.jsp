<%@ page import="cz.mallat.uasparser.UserAgentInfo" %>

<%@ page import="java.io.IOException" %>
<%@ page import="cz.mallat.uasparser.UASparser" %>
<%@ page import="cz.mallat.uasparser.OnlineUpdater" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<body>
<h2>Hello World!</h2>
<%
    UASparser uasParser=new UASparser(OnlineUpdater.getVendoredInputStream());
    String usergent=request.getHeader("User-Agent");
    System.out.println(usergent);
    try {
        UserAgentInfo userAgentInfo = uasParser.parse(usergent);
        //System.out.println("操作系统名称："+userAgentInfo.getOsFamily());//
        //System.out.println("操作系统："+userAgentInfo.getOsName());//
        //System.out.println("浏览器名称："+userAgentInfo.getUaFamily());//
        //System.out.println("浏览器版本："+userAgentInfo.getBrowserVersionInfo());//
        //System.out.println("设备类型："+userAgentInfo.getDeviceType());
        //System.out.println("浏览器:"+userAgentInfo.getUaName());
        //System.out.println("类型："+userAgentInfo.getType());

        out.println("操作系统名称："+userAgentInfo.getOsFamily());
        out.println("操作系统："+userAgentInfo.getOsName());
        out.println("ip地址:"+request.getRemoteAddr());
        out.println("浏览器名称："+userAgentInfo.getUaFamily());
        out.println("浏览器版本："+userAgentInfo.getBrowserVersionInfo());
        out.println("设备类型："+userAgentInfo.getDeviceType());
        out.println("浏览器:"+userAgentInfo.getUaName());
        out.println("类型："+userAgentInfo.getType());

        out.println(request.getServerName());

    } catch (IOException e) {
        e.printStackTrace();
    }
%>






</p>
</body>
</html>

