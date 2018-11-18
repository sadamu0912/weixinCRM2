package com.xjxspace.controller.project;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.xjxspace.util.CSVHandler;
import com.xjxspace.util.ExcelReader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.xjxspace.model.frame.ControllerHandler;
import com.xjxspace.model.frame.RestResult;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Controller
public class PhotoController extends ControllerHandler{

	@RequestMapping(value="/upload",method=RequestMethod.POST)
	@ResponseBody
	public RestResult uploadPhoto(@RequestParam("file") MultipartFile multipartFile,HttpServletRequest request){
		try{
			InputStream is = multipartFile.getInputStream();
			//csv 文件
			/*InputStream is = multipartFile.getInputStream();
			List<Map<String,Object>> list =  CSVHandler.readCSV(is);
			for(Map<String,Object> bean:list){
				System.out.println(JSONObject.toJSONString(bean));
				System.out.println("=====");
			}*/
			//xls 文件
			ExcelReader reader = new ExcelReader();
			reader.readXls(is);

		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
