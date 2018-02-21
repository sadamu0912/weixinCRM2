package com.xjxspace.controller.project;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.xjxspace.model.frame.ControllerHandler;
import com.xjxspace.model.frame.RestResult;
import com.xjx.util.FileUploadHelper;
@Controller
@RequestMapping("/photo")
public class PhotoController extends ControllerHandler{

	@RequestMapping(value="/upload",method=RequestMethod.POST)
	@ResponseBody
	public RestResult uploadPhoto(@RequestParam MultipartFile[] multipartFiles,HttpServletRequest request){
		try{
			FileUploadHelper.upload(request, multipartFiles, "/upload");
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
