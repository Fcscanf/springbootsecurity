package cn.fcsca.springbootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * PageController
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 21:44 2018-08-25
 */
@Controller
public class PageController {

    private final String PREFIX = "pages/";

    /**
     * 欢迎页 
     *
     * @param
     * @return 
     * @author Fcscanf@樊乘乘
     * @date 下午 21:46 2018-08-25 
     */
    @GetMapping("/")
    public String index() {
        return "welcome";
    }

    @GetMapping("/level1/{path}")
    public String level1(@PathVariable("path") String path) {
        return PREFIX + "level1/" + path;
    }

    @GetMapping("/level2/{path}")
    public String level2(@PathVariable("path") String path) {
        return PREFIX + "level2/" + path;
    }

    @GetMapping("/level3/{path}")
    public String level3(@PathVariable("path") String path) {
        return PREFIX + "level3/" + path;
    }

    @GetMapping("/userlogin")
    public String loginPage() {
        return PREFIX + "login";
    }
}
