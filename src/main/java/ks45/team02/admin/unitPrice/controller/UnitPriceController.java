package ks45.team02.admin.unitPrice.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("goods")
public class UnitPriceController {

    @GetMapping("/addGoodsUnitPrice")
    public String addGoodsunitPrice(){
        return "goods/addGoodsUnitPrice";
    }

    @GetMapping("/listGoodsUnitPrice")
    public String listGoodsUnitPrice(){
        return "goods/listGoodsUnitPrice";
    }
}
