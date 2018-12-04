package democlient;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

public class DemoClient {

    public static void main(String[] args) throws IOException {
        
        InetSocketAddress addr = new InetSocketAddress("centos-server-00", 10000);
        DemoNameNodeProtocal proxy = RPC.getProxy(DemoNameNodeProtocal.class, -1L, addr, new Configuration());
        String mataData = proxy.getMataData(" 傻逼 ");
        System.out.println(mataData);
        
    }

}
