package Controller;


import com.example.demo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
@Controller
public class IndexController {

        @RequestMapping("/")

        public String testModel(Model model) {


            model.addAttribute("message","helloMessage");


            model.addAttribute("name","<span style='color:red'>lucas</span>");

            User user = new User();

            user.setAge(20);
            

            user.setName("lucas");
            final Model user1 = model.addAttribute("user", user);


            return "index";

        }


        @RequestMapping("/editPassword")


        @ResponseBody

        public String editPassword(HttpServletRequest request) {


            String oldPassword = request.getParameter("oldPassword");

            System.out.println("...........editPass.oldPassword:....." + oldPassword);

            return "msg";

        }

    }
