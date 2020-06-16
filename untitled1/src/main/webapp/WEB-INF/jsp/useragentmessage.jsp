<%--
  Created by IntelliJ IDEA.
  User: Sam
  Date: 2020/6/9
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>usergentmessage</title>

</head>
<body style="margin: 0px;overflow: hidden;color:snow;font-size: 30px;font-weight: bold">
<div style="width: 100%;height: 100%;background-color: black">
    <div align="center" style="height: 10%">
        <table>
            <tr>
                <td width="20%">User-Gent</td>
                <td>${usergent}</td>
            </tr>
        </table>
    </div>

    <div align="center" style="height: 80% ;width: 100%">
        <div >
            <img src="/img/win.jpg" width="300px" height="200px">
        </div>
        <div style="margin-top: 50px;">
            <table align="center" style="text-align: center">
                <tr>
                    <td >操作系统</td>
                    <td >${log.systemname}</td>
                </tr>
                <tr >
                    <td >设备类型</td>
                    <td>${log.mechine}</td>
                </tr>
                <tr>
                    <td >ip信息</td>
                    <td>${log.ip}</td>
                </tr>
                <tr >
                    <td >浏览器</td>
                    <td>${log.browser}</td>
                </tr>
                <tr >
                    <td >通信协议</td>
                    <td>${m.network}</td>
                </tr>
                <tr >
                    <td >端口号</td>
                    <td>${m.port}</td>
                </tr>
                <tr >
                    <td >访问时间</td>
                    <td>${m.time}</td>
                </tr>

            </table>

        </div>

    </div>
</div>



</body>
</html>
