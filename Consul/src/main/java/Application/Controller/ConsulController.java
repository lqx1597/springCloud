package Application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lqx
 * @date 2019/7/6
 */
@RestController
public class ConsulController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/getServiceUrl")
    public List<String> getServiceUrl() {
        List<ServiceInstance> list = discoveryClient.getInstances("consul-member");
        List<String> services = new ArrayList<>();
        for (ServiceInstance serviceInstance : list) {
            if (serviceInstance != null) {
                services.add(serviceInstance.getUri().toString());
            }
        }
        return services;
    }
}
