package gzfzkj.controller;

import gzfzkj.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 钟桑扬 on 2017-12-20.
 */
@Controller
@RequestMapping("/user")
public class UserController {

        private static Logger logger=LoggerFactory.getLogger(UserController.class);

        // /user/test?id=1
        @RequestMapping(value = "/test",method = RequestMethod.GET)
        private String testSsm(Model model, HttpServletRequest request){
            int userId=Integer.parseInt(request.getParameter("userId"));
            System.out.println("userId: 等于"+userId);
            User user=null;
            if(userId==1){
                user=new User();
                user.setAge(20);
                user.setPassword("123456");
                user.setUsername("钟桑扬");
            }
            logger.debug(user.toString());
            model.addAttribute("user",user);
            return "index";
        }
}
