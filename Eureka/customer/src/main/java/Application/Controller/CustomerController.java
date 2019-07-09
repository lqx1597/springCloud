package Application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lqx
 * @date 2019/7/5
 */
@RestController
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getCustomer")
    public String getCustomer() {
        // order 使用rpc 远程调用技术 调用 会员服务
        String memberUrl = "http://www.product/getPorduct";
        String result = restTemplate.getForObject(memberUrl, String.class);
        System.out.println("会员服务调用订单服务,result:" + result);
        return "消费者调用生产者："+result;
    }
}
