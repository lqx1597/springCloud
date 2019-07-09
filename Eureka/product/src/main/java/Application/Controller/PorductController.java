package Application.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lqx
 * @date 2019/7/5
 */
@RestController
public class PorductController {

    @RequestMapping("/getPorduct")
    public String getPorduct() {
        return "这是服务生产者";
    }
}
