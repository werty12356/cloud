package org.cloud.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wdy
 * @version 1.0
 * @date 2022/6/17 10:51
 */
@RestController
@Api(tags = "微服务测试")
public class CloudController {
    @GetMapping("/cs")
    @ApiOperation(value = "测试")
    @ResponseBody
    public String getResult() {
        return "hell,swagger";
    }
}
