package com.example.smspr2.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/api/tbpost")
@RestController
public class TbpostRestController {

    List<Map<String, Object>> tbpostList = new ArrayList<>();

    @GetMapping("/create")
    public Map<String, Object> create(@RequestParam Map<String, Object> param){
        Map<String, Object> returnData = new HashMap<>();

        int resultCode = 0;
        String writer = param.get("writer") + "";
        String title = param.get("title") + "";
        String content = param.get("content") + "";

        if("".equals(writer) || "null".equals(writer)) {
            resultCode = -100;
        }else if("".equals(title) || "null".equals(title)){
            resultCode = -200;
        }else if("".equals(content) || "null".equals(content)) {
            resultCode = -300;
        }else{
            resultCode = 100;
            Map<String, Object> newData = new HashMap<>();
            newData.put("order", tbpostList.size()+1);
            newData.put("writer", writer);
            newData.put("title", title);
            newData.put("content", content);
            tbpostList.add(newData);
        }

        returnData.put("resultCode", resultCode);
        returnData.put("order", tbpostList.size());

        return returnData;
    }

    @GetMapping("/list")
    public Map<String, Object> list(){
        Map<String, Object> returnData = new HashMap<String, Object>();
        int resultCode = 0;
        if(tbpostList.isEmpty()){
            resultCode = -100;
        }
        else{
            resultCode = 100;
        }
        returnData.put("resultCode", resultCode);
        returnData.put("data", tbpostList);
        return returnData;
    }

    @GetMapping("/detail/{order}")
    public Map<String, Object> detail(@PathVariable String order){
        Map<String, Object> returnData = new HashMap<>();
        int resultCode = 0;
        int intOrder = 0;
        try{
            intOrder = Integer.parseInt(order);
            if(intOrder <= tbpostList.size() || intOrder > 0){
                returnData.put("data", tbpostList.get(intOrder - 1));
                resultCode = 200;
            } else {
                resultCode = -200;
            }
        } catch (Exception e){
            resultCode = -100;
        }
        returnData.put("resultCode", resultCode);

        return returnData;
    }

    @GetMapping("/update")
    public Map<String, Object> update(@RequestParam Map<String, Object> params){
        Map<String, Object> returnData = new HashMap<>();
        String order = (String) params.get("order");
        int resultCode = 0;
        int intOrder = 0;
        try{
            intOrder = Integer.parseInt(order);
            if(intOrder <= tbpostList.size() || intOrder > 0){
                Map<String, Object> each = tbpostList.get(intOrder - 1);
                if(params.get("title") != null && !"".equals(params.get("title"))){
                    each.put("title", params.get("title"));
                }
                if(params.get("content") != null && !"".equals(params.get("content"))){
                    each.put("content", params.get("content"));
                }
                resultCode = 200;
            } else {
                resultCode = -200;
            }
        } catch (Exception e){
            resultCode = -100;
        }
        returnData.put("resultCode", resultCode);
        return returnData;
    }

}
