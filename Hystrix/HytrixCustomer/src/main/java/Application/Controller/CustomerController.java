package Application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author lqx
 * @date 2019/7/5
 */
@RestController
public class CustomerController {


    @Autowired
    private ProductService productService;

    @RequestMapping("/getCustomer")
    public String getCustomer() {
        return productService.getMember();
    }
}
