package com.t.s;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
   
   private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
   
   /**
    * Simply selects the home view to render by returning its name.
    */
   @RequestMapping(value = "/home.do", method = RequestMethod.GET)
   public String home(Locale locale, Model model) {
      logger.info("Welcome home! The client locale is {}.", locale);
      
      Date date = new Date();
      DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
      
      String formattedDate = dateFormat.format(date);
      
      model.addAttribute("serverTime", formattedDate );
      
      return "index";
   } 
   
   @RequestMapping(value="/boardList.do", method=RequestMethod.GET)
   public String boardList() {
      
      return "boardList";
   }
   @RequestMapping(value="/boardListPhoto.do", method=RequestMethod.GET)
   public String boardListPhoto() {
      
      return "boardListPhoto";
   }
   @RequestMapping(value="/boardDetail.do", method=RequestMethod.GET)
   public String boardDetail() {
      
      return "boardDetail";
   }
   @RequestMapping(value="/boardDetailPhoto.do", method=RequestMethod.GET)
   public String boardDetailPhoto() {
      
      return "boardDetailPhoto";
   }
   @RequestMapping(value="/boardWrite.do", method=RequestMethod.GET)
   public String boardWrite() {
      
      return "boardWrite";
   }
//
   @RequestMapping(value="/detail.do", method=RequestMethod.GET)
   public String detail() {
      
      return "detail";
   }
   @RequestMapping(value="/login.do", method=RequestMethod.GET)
   public String login() {
      
      return "login";
   }
   @RequestMapping(value="/moim.do", method=RequestMethod.GET)
   public String moim() {
      
      return "moim";
   }
   @RequestMapping(value="/moimDetail.do", method=RequestMethod.GET)
   public String moimDetail() {
      
      return "moimDetail";
   }
   @RequestMapping(value="/search.do", method=RequestMethod.GET)
   public String search() {
      
      return "search";
   }
   
	@RequestMapping(value = "/mapRes.do", method = RequestMethod.POST)
	public String mapRes(Locale locale, Model model, String editTitle, String editor, String Lat, String Lng /*, testDto dto*/) {
		
	/*	testDto dtosum = new testDto();
		dtosum.setTitle(editTitle);
		dtosum.setContent(editor);
		
		
		int res = biz.insert(dto);
		*/
		
		model.addAttribute("editTitle", editTitle);
		model.addAttribute("editor",editor);
		
		
		/*model.addAttribute("dtosum",res);*/
		model.addAttribute("Lat",Lat);
		model.addAttribute("Lng",Lng);
		
		
		
		
		return "moimDetail";
	}
  
	   @RequestMapping(value="/moimwrite.do", method=RequestMethod.GET)
	   public String moimwrite() {
	      
	      return "moimwrite";
	   }
  
   
   /*업로드=================================*/
   @RequestMapping(value = "/coding.do")
   public String coding() {
       return "coding";
   }

   @RequestMapping(value = "/insertBoard.do", method = RequestMethod.POST)
   public String insertBoard(String editor) {
       System.err.println("저장할 내용 : " + editor);
       return "redirect:/coding.do";
   }

   // 다중파일업로드
   @RequestMapping(value = "/file_uploader_html5.do",
                 method = RequestMethod.POST)
   @ResponseBody
   public String multiplePhotoUpload(HttpServletRequest request) {
       // 파일정보
       StringBuffer sb = new StringBuffer();
       try {
           // 파일명을 받는다 - 일반 원본파일명
           String oldName = request.getHeader("file-name");
           // 파일 기본경로 _ 상세경로
           String filePath = "C:/Users/정성/git/On-Off/OnOff/src/main/webapp/resources/photoUpload/";
           String saveName = sb.append(new SimpleDateFormat("yyyyMMddHHmmss")
                         .format(System.currentTimeMillis()))
                         .append(UUID.randomUUID().toString())
                         .append(oldName.substring(oldName.lastIndexOf("."))).toString();
           InputStream is = request.getInputStream();
           OutputStream os = new FileOutputStream(filePath + saveName);
           int numRead;
           byte b[] = new byte[Integer.parseInt(request.getHeader("file-size"))];
           while ((numRead = is.read(b, 0, b.length)) != -1) {
               os.write(b, 0, numRead);
           }
           os.flush();
           os.close();
           // 정보 출력
           sb = new StringBuffer();
           sb.append("&bNewLine=true")
             .append("&sFileName=").append(oldName)
             .append("&sFileURL=").append("http://localhost:8787/s/resources/photoUpload/")
       .append(saveName);
       } catch (Exception e) {
           e.printStackTrace();
       }
       return sb.toString();
   }
  /*업로드 끝===============================================*/
  
   
   
   
}