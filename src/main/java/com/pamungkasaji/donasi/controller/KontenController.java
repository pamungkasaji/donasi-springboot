package com.pamungkasaji.donasi.controller;

import com.pamungkasaji.donasi.service.KontenService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KontenController {

    private KontenService kontenService;

    public KontenController(KontenService kontenService) {
        this.kontenService = kontenService;
    }

    @RequestMapping({"/konten", "/konten/index", "/konten/index.html", "/konten.html"})
    public String kontenList(Model model){

        model.addAttribute("kontens", kontenService.findAllKonten());

        return "konten/index";
    }

    @GetMapping("konten/{kontenId}")
    public ModelAndView showKonten(@PathVariable Long kontenId) throws Exception{
        ModelAndView mav = new ModelAndView("konten/kontenDetail");
        mav.addObject(kontenService.findKontenById(kontenId));
        return mav;
    }
}
