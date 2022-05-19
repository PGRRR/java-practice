package nosleepcoders.golf.controller;

import nosleepcoders.golf.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserInfoController {
    private List<Member> memberList = new ArrayList<Member>();

    @PostMapping("/userInfo")
    public String signIn(Member member, Model model) {
        model.addAttribute("id", member.getUserId());
        model.addAttribute("pw", member.getPassword());
        memberList.add(member);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("userList", memberList);
        return "list";
    }
}
