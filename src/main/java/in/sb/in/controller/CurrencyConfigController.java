package in.sb.in.controller;

import in.sb.in.configuration.CurrencyServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {
    @Autowired
    private CurrencyServiceConfiguration configuration;

    @GetMapping("/currency-configuration")
    public CurrencyServiceConfiguration getConfiguration(){
        return configuration;
    }

}
