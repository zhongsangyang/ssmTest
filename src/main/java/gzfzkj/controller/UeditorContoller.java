package gzfzkj.controller;

import gzfzkj.service.UeditorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by 钟桑扬 on 2018/1/4.
 */
@Controller
@RequestMapping("/ueditor")
public class UeditorContoller {
    @Resource
    private UeditorService ueditorService;
    @RequestMapping("/toueditor")
    public String toUeditorJsp(){

        return "testUeditor";
    }
    @RequestMapping(value = "/testUeditor",method = RequestMethod.POST)
    public String testUeditor(String content){
        System.out.println(content);
        ueditorService.AddDataToDatabase(content);
        return "testUeditor";
    }
}
