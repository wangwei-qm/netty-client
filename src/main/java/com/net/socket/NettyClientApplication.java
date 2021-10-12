package com.net.socket;

import com.net.socket.netty.NettyClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NettyClientApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(NettyClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //启动netty客户端
        NettyClient nettyClient = new NettyClient();
        nettyClient.start(args[0], Integer.parseInt(args[1]));
    }
}
