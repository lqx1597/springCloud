package Application.Controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.naming.Name;

/**
 * @author lqx
 * @date 2019/7/9
 */
@FeignClient("www.product")
public interface ProductService {

    @RequestMapping("/getPorduct")
    public String getMember();

}
