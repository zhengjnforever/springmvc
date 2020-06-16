package cn.tx.pojo;

/**
 * @program: untitled1
 * @description:
 * @author: Sam
 * @create: 2020-06-09 21:32
 **/

public class log {

    //这个是需要保存在数据库的信息类

    private String systemname;
    private String mechine;

    private String ip;
    private String browser;

    public log(String systemname,String mechine,String ip,String browser){
        this.systemname=systemname;
        this.ip=ip;
        this.mechine=mechine;
        this.browser=browser;
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMechine() {
        return mechine;
    }

    public void setMechine(String mechine) {
        this.mechine = mechine;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
}
