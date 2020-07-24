package com.java;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Set;

@Controller
@RequestMapping("/product")
public class ProductController {

	//tried adding consumes type
	// Request coming as json
	@PostMapping(path = "/add")
	public String createProduct(@Valid ProductInput productInput, BindingResult result, HttpServletRequest request, Model model) {
		if(result.hasErrors()) {
			System.out.println(result.getFieldError());
			model.addAttribute("message", "invalid details");
			return "product";
		}

		Set<MultipartFile> mf = productInput.getFiles();

		for(MultipartFile multipartFile: mf){
			String fileName = multipartFile.getOriginalFilename();
			System.out.println(fileName);

			File testFile = new File(request.getServletContext().getRealPath("/uploadedFiles"), fileName);
			String filePath = "http://localhost:8080/uploadedFiles/"+fileName;

			model.addAttribute("fileName", filePath);

			try{
				multipartFile.transferTo(testFile);
			}
			catch (IOException e){
				System.out.println("transfer failed");
			}
		}

		model.addAttribute("product", productInput);
		System.out.println("Request in for :" + request.getRequestURI());
		return "success";
	}

	@GetMapping
	public String getProduct() {
		return "product";
	}

}
