package com.t.s;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
   
   
}