package Application.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lqx
 * @date 2019/7/5
 */
@RestController
public class PorductController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getPorduct")
    public String getPorduct() {
        return "这是服务生产者，端口号"+serverPort;
    }
}
