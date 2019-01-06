package com.didispace.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
 
@ResponseBody
@RequestMapping(value = "/moblie", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
public String writeByBody(@RequestBody JSONObject jsonParam) {
    // 直接将json信息打印出来
    System.out.println(jsonParam.toJSONString());

    // 将获取的json数据封装一层，然后在给返回
    JSONObject result = new JSONObject();
    result.put("msg", "ok");
    result.put("method", "@ResponseBody");
    result.put("data", jsonParam);

    return result.toJSONString();
}


}