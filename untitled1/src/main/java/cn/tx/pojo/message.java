package cn.tx.pojo;



/**
 * @program: untitled1
 * @description: a
 * @author: Sam
 * @create: 2020-06-11 20:54
 **/

public class message {

    //通信协议获取
    private String network;
    //端口
    private int port;
    //访问时间
    private String time;
    //运行环境
    private String enviroment;

    public message(String network,int port,String time,String enviroment){
        this.network=network;
        this.port=port;
        this.time=time;
        this.enviroment=enviroment;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEnviroment() {
        return enviroment;
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }
}
