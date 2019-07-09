package Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lqx
 * @date 2019/7/5
 * 注册中心
 */

@SpringBootApplication
@EnableEurekaServer
public class ClientApplication9100 {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication9100.class,args);
    }
}
