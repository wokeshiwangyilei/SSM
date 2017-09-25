package com.wyl.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/up")
public class Control {

	@RequestMapping(value = "/uppp")
	@ResponseBody
	public String 上传(HttpServletRequest request, HttpSession session) throws IllegalStateException, IOException {
		if (request instanceof MultipartHttpServletRequest) {
			MultipartHttpServletRequest mulRequest = (MultipartHttpServletRequest) request;

			// 文件表单数据 -- 不管多少个文件，都通过次对象获取。key是表单的名字
			Map<String, MultipartFile> fileMap = mulRequest.getFileMap();

			MultipartFile file1 = fileMap.get("file");

			// 文件保存路径
			String realPath = request.getServletContext().getRealPath("/upload");

			File fileSave = new File(realPath, file1.getOriginalFilename());

			file1.transferTo(fileSave);

			String imgePath = "upload/" + file1.getOriginalFilename();
			return "{\"resultCode\":\"1\",\"imgePath\":\"" + imgePath + "\"}";
		} else {
			return "{\"resultCode\":\"-11\"}";
		}

	}
}
