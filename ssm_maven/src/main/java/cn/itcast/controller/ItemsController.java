package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Items> items = itemsService.findAll();
        model.addAttribute("items",items);
        return "itemsList";
    }
}
