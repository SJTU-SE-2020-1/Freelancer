package com.freelancer.freelancer.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.freelancer.freelancer.constant.Constant;
import com.freelancer.freelancer.entity.User;
import com.freelancer.freelancer.entity.Work;
import com.freelancer.freelancer.service.WorkService;
import com.freelancer.freelancer.utils.msgutils.Msg;
import com.freelancer.freelancer.utils.msgutils.MsgCode;
import com.freelancer.freelancer.utils.msgutils.MsgUtil;
import com.freelancer.freelancer.utils.sessionutils.SessionUtil;
import net.sf.json.JSONObject;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;


@RestController
public class WorkController {
    @Autowired
    private WorkService workService;
    @RequestMapping("/postWork")
    public void addProject(@RequestBody Map<String, String> params) {
        String name = params.get("title");
        Double paymentLower = Double.parseDouble(params.get("paymentLower"));
        Double paymentHigher = Double.parseDouble(params.get("paymentHigher"));
        String description = params.get("description");

//        Work work = workService.findByTitle(name);
//        if(work == null){
        Work work = new Work();
        work.setTitle(name);
        work.setPaymentLower(paymentLower);
        work.setPaymentHigher(paymentHigher);
        work.setDescription(description);
        workService.save(work);
    }

    @RequestMapping("/getWorks")
    public String getWorks(@RequestBody Map<String, Integer> params) {
        System.out.println("test");
        Integer PageNum = params.get("pagenum");
        Integer PageContentNum = params.get("size");
        if (PageNum <=0 || PageContentNum <=0) { PageNum = 1; PageContentNum = 20; }

        Pageable pageable = PageRequest.of(PageNum - 1, PageContentNum, Sort.by(Sort.Direction.ASC, "wId"));
        List<Work> data = workService.getWorks(pageable).getContent();

        ArrayList<JSONArray> workJson = new ArrayList<>();
        Iterator<Work> it = data.iterator();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        while(it.hasNext()){
            Work work = (Work) it.next();

            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(String.valueOf(work.getuId()));
            arrayList.add(String.valueOf(work.getWId()));
            arrayList.add(work.getDescription());
            arrayList.add(work.getTitle());
            arrayList.add(String.valueOf(work.getPaymentLower()));
            arrayList.add(String.valueOf(work.getPaymentHigher()));
            arrayList.add(dateFormat.format(work.getBiddingDdl()));
            arrayList.add(dateFormat.format(work.getFinishDdl()));
            arrayList.add(String.valueOf(work.getStatus()));

            workJson.add((JSONArray) JSONArray.toJSON(arrayList));
        }
        String  res = JSON.toJSONString(workJson, SerializerFeature.BrowserCompatible);

        return res;
    }

    @RequestMapping("/getPostedWorks")
    public List<Work> getPostedWorks(@RequestBody Map<String, Integer> params) {
        Integer PageNum = params.get("pagenum");
        Integer PageContentNum = params.get("size");
        Integer uId = params.get("u_id");
        if (PageNum <=0 || PageContentNum <=0) { PageNum = 1; PageContentNum = 20; }

        Pageable pageable = PageRequest.of(PageNum - 1, PageContentNum, Sort.by(Sort.Direction.ASC, "wId"));

        return workService.getPostedWorks(uId, pageable).getContent();
    }

    @RequestMapping("/getFinishedWorks")
    public List<Work> getFinishedWorks(@RequestBody Map<String, Integer> params) {
//        Integer PageNum = params.get("pagenum");
//        Integer PageContentNum = params.get("size");
        Integer uId = params.get("u_id");
//        if (PageNum <=0 || PageContentNum <=0) { PageNum = 1; PageContentNum = 20; }

        Integer status = 1;
        return workService.getWorkerWorks(uId);
    }
}
