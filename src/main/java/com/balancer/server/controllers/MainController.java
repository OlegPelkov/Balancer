package com.balancer.server.controllers;

import com.balancer.server.data.DataFromCash;
import com.balancer.server.data.Session;
import com.balancer.server.services.GetSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by o.pelkov on 21.03.2018.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    GetSession getSession;

    @RequestMapping (method = RequestMethod.GET)
    @ResponseBody
    public Session getStatus(ModelMap modelMap){
        modelMap.addAttribute("message", "id = 0001234156877");
        return new Session();
    }

    @RequestMapping (value = "/getSession", method = RequestMethod.GET) //TODO нужен POST запрос с id кассы, чтобы была привязка 1 касса 1 фр
    @ResponseBody
    public Session getFiscalPrinterSession(){
        Session session = getSession.get();
        if(session!=null) {
            return session;
        } else {
            return new Session("all fr busy");
        }
    }

    @RequestMapping (value = "/endSession", method = RequestMethod.POST) //TODO нужен POST запрос с id кассы, чтобы была привязка 1 касса 1 фр
    @ResponseBody
    public Session endFiscalPrinterSession(){
        Session session = getSession.get();
        if(session!=null) {
            return session;
        } else {
            return new Session("all fr busy");
        }
    }


    @RequestMapping (value = "/getData", method = RequestMethod.GET)
    @ResponseBody
    public DataFromCash getData(ModelMap modelMap){
        DataFromCash dataFromCash = new DataFromCash("0004","SDFGDVBVFGBGFBFGB0001234156877");
        return dataFromCash;
    }

    @RequestMapping (value = "/fiscalize", method = RequestMethod.POST)
    @ResponseBody
    public Session fiscalizeData(@RequestBody DataFromCash dataFromCash){
        if(dataFromCash!=null) {
            System.out.println(dataFromCash.getData());
            System.out.println(dataFromCash.getSession());
        }
        return new Session();
    }
}
