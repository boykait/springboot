package springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Petri Kainulainen
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public List<User> renderHelloWorldView() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "user1", 20));
        users.add(new User(2, "user2", 19));
        return users;
    }

    @RequestMapping("/show")
    public String show(Map<String, Object> map) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "user1", 20));
        users.add(new User(2, "user2", 19));
        map.put("test", "欢迎进入HTML页面");
        map.put("users", users);
        return "index";
    }

    @RequestMapping("/showHtml")
    public ModelAndView showHtml(HashMap<String, Object> map) {
//        Map<String, String> map = new HashMap<>(16);
        map.put("hello", "欢迎进入HTML页面");
        List<User> users = new ArrayList<>();
        users.add(new User(1, "user1", 20));
        users.add(new User(2, "user2", 19));
        return new ModelAndView("index");
    }
}

class User {
    private int id;
    private String name;
    private int age;

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
