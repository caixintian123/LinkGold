package com.linkgold.base;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("base")
@Api(tags = "222", value = "111")
public class BaseController {
    private static final Logger log = LoggerFactory.getLogger(BaseController.class);

    @GetMapping("test")
    public void testLog(){
        log.info("this is info log");
        log.warn("this is warn log");
        log.error("this is error log");
    }
}
