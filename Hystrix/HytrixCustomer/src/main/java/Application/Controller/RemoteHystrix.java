package Application.Controller;

import org.springframework.stereotype.Component;

/**
 * @author lqx
 * @date 2019/7/9
 */
@Component
public class RemoteHystrix implements ProductService{
    @Override
    public String getMember() {
        return "熔断器测试成功！";
    }
}
