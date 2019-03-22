package com.t.s;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import com.t.s.model.biz.MoimBiz;
import com.t.s.model.biz.MoimBizImpl;
import com.t.s.model.biz.MoimUserBiz;
import com.t.s.model.biz.UserBiz;
import com.t.s.model.dto.MoimDto;
import com.t.s.model.dto.MoimUserDto;
import com.t.s.model.dto.UserDto;

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
   public String boardList(HttpSession session, Model model) {
      
	   if(session.getAttribute("dto")!=null) {
		   model.addAttribute("dto", session.getAttribute("dto"));
		   }
	   
      return "boardList";
   }
   @RequestMapping(value="/boardListPhoto.do", method=RequestMethod.GET)
   public String boardListPhoto(HttpSession session, Model model) {
      
	   if(session.getAttribute("dto")!=null) {
		   model.addAttribute("dto", session.getAttribute("dto"));
		   }
	   
      return "boardListPhoto";
   }
   @RequestMapping(value="/boardDetail.do", method=RequestMethod.GET)
   public String boardDetail(HttpSession session, Model model) {
      
	   if(session.getAttribute("dto")!=null) {
		   model.addAttribute("dto", session.getAttribute("dto"));
		   }
	
	   
      return "boardDetail";
   }
   @RequestMapping(value="/boardDetailPhoto.do", method=RequestMethod.GET)
   public String boardDetailPhoto(HttpSession session, Model model) {
      
	   if(session.getAttribute("dto")!=null) {
		   model.addAttribute("dto", session.getAttribute("dto"));
		   }

	   
      return "boardDetailPhoto";
   }
   @RequestMapping(value="/boardWrite.do", method=RequestMethod.GET)
   public String boardWrite(HttpSession session, Model model) {
      
	   if(session.getAttribute("dto")!=null) {
		   model.addAttribute("dto", session.getAttribute("dto"));
		   }
	
	   
      return "boardWrite";
   }
//
   @RequestMapping(value="/detail.do", method=RequestMethod.GET)
   public String detail() {
      
      return "detail";
   }

   
   @RequestMapping(value="/moim.do", method=RequestMethod.GET)
   public String moim(HttpSession session, Model model) {
	   
	   if(session.getAttribute("dto")!=null) {
		   model.addAttribute("dto", session.getAttribute("dto"));
		   }
	
	   //리스트 가져오기
	   
	   model.addAttribute("list", moimbiz.selectMoimList());
	   
      
      return "moim";
   }
   @RequestMapping(value="/moimDetail.do", method=RequestMethod.GET)
   public String moimDetail(HttpSession session, Model model, int moimno) {
      
	   if(session.getAttribute("dto")!=null) {
		   model.addAttribute("dto", session.getAttribute("dto"));
		   }
	
	   model.addAttribute("res", moimbiz.selectMoim(moimno));
		
	/*	MoimDto res = moimbiz.selectMoim(moimno);
		
		model.addAttribute("res", res);*/
	   
      return "moimDetail";
   }
   @RequestMapping(value="/search.do", method=RequestMethod.POST)
   public String search(Model model, String searchText, HttpSession session) {
      
	   if(session.getAttribute("dto")!=null) {
	   model.addAttribute("dto", session.getAttribute("dto"));
	   }
	   
      return "search";
   }
   
   @Autowired
   private MoimBiz moimbiz;
   
	@RequestMapping(value = "/mapRes.do", method = RequestMethod.POST)
	public String mapRes(HttpSession session, Locale locale, Model model, MoimDto moimdto ) {

		
		
		Date date = new Date();
		
		moimdto.setMoimregdate(date);
		
		System.out.println(moimdto);
		
		int res = moimbiz.insertMoim(moimdto);
		
		   if(session.getAttribute("dto")!=null) {
				
				if(res > 0 ) {
					 model.addAttribute("dto", session.getAttribute("dto"));
				}
			   
			   }
		
		return "redirect:moim.do";
	}
  
	   @RequestMapping(value="/moimwrite.do", method=RequestMethod.GET)
	   public String moimwrite() {
	      
	      return "moimwrite";
	   }
  
	   @RequestMapping(value="/groupDetail.do", method=RequestMethod.GET)
	   public String groupDetail() {
	      
	      return "groupDetail";
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
           String filePath = WebUtils.getRealPath(request.getSession().getServletContext(), "/fileUpload/");
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
             .append("&sFileURL=").append("/s/fileUpload/")
             .append(saveName);
       } catch (Exception e) {
           e.printStackTrace();
       }
       return sb.toString();
   }
  /*업로드 끝===============================================*/
  
	/////////////////////////////////////////////////////////////////
	// 로그인	
	@Autowired
	private UserBiz biz;
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login() {

		return "login";
	}

	@RequestMapping(value = "/loginajax.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Boolean> login(String id, @RequestParam("pw") String password, HttpSession session) {

		UserDto dto = biz.login(id, password);
		boolean loginchk = false;

		if (dto != null) {
			session.setAttribute("dto", dto);
			session.setAttribute("id", id);
			loginchk = true;
		}

		Map<String, Boolean> res = new HashMap<String, Boolean>();
		res.put("loginchk", loginchk);

		return res;
	}
	
	// 로그아웃
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String login(HttpSession session) {
		
		if(session.getAttribute("dto")!=null) {
			session.invalidate();
		}
		
		return "redirect:home.do";
	}

	// 회원가입폼
	@RequestMapping(value = "/registUser.do", method = RequestMethod.GET)
	public String registUser() {

		return "registUser";
	}

	// 회원가입
	@RequestMapping(value = "/regist.do", method = RequestMethod.POST)
	public String regist(@ModelAttribute UserDto dto) {

		int res = biz.regist(dto);

		if (res > 0) {
			return "registOk";
		} else {
			return "redirect:registUser.do";
		}
	}

	// 아이디 중복확인
	@RequestMapping(value = "/idchk.do", method = RequestMethod.GET)
	public String idChk(Model model, @RequestParam("id") String id) {
		UserDto dto = biz.idchk(id);
		boolean idNotUse = true;

		if (dto != null) { // 중복된 아이디가 존재
			idNotUse = false;
		}

		model.addAttribute("idNotUse", idNotUse);

		return "idchk";
	}
	
	String clientId = "e0dUMyM7NUTzBbVCNs6W"; //애플리케이션 클라이언트 아이디값";
	String clientSecret = "k_d25QLXXg"; //애플리케이션 클라이언트 시크릿값";
	
	// 자동 등록 방지
	@RequestMapping(value = "/captcha.do", method = RequestMethod.GET)
	public void captcha(HttpServletRequest request, HttpServletResponse response) {

		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String dirPath = request.getRealPath("captchaImage") + "\\";
		System.out.println(dirPath);
		
		String captchaImageName = null;
		String result=null;
		//System.out.println(captchaImageName);
		String key = request.getParameter("key");
		String value = request.getParameter("value");

	   if (value != null) {
			
			result=this.captchaNkeyResult(key, value);
			System.out.println("resultA>>>"+result);
			
			JSONObject obj = new JSONObject();
			obj.put("result", result);
			out.println(obj.toJSONString());
		} else {
			key = this.captchaNkey();
			captchaImageName = this.captchaImage(key, dirPath);
			result = "{\"key\":\""+key+"\", \"captchaImageName\":\""+captchaImageName+"\"}";
			System.out.println("resultB>>>"+result);
			
			JSONObject obj = new JSONObject();
			obj.put("key", key);
			obj.put("captchaImageName", captchaImageName);
	
			out.println(obj.toJSONString());
		}
	   
	}
	
	public String captchaNkey() {
		String result = null;
		try {
			String code = "0"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
			String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			StringBuffer sb = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				sb.append(inputLine);
			}
			br.close();
			result = sb.toString().substring(8, 8 + 16);
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public String captchaImage(String key, String dirPath) {
		String result = null;
		try {
			//String key = "CAPTCHA_KEY"; // https://openapi.naver.com/v1/captcha/nkey 호출로 받은 키값
			String apiURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				InputStream is = con.getInputStream();
				int read = 0;
				byte[] bytes = new byte[1024];
				// 랜덤한 이름으로 파일 생성
				//dirPath="C:\\Users\\Clark\\workspace\\ajax\\WebContent\\captchaImage\\";
				String tempname = Long.valueOf(new Date().getTime()).toString();
				File f = new File(dirPath + tempname + ".jpg");
				f.createNewFile();
				OutputStream outputStream = new FileOutputStream(f);
				while ((read = is.read(bytes)) != -1) {
					outputStream.write(bytes, 0, read);
				}
				result = tempname + ".jpg";
				outputStream.close();
				is.close();
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				String inputLine;
				StringBuffer sb = new StringBuffer();
				while ((inputLine = br.readLine()) != null) {
					sb.append(inputLine);
				}
				br.close();
				System.out.println(sb.toString());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public String captchaNkeyResult(String key, String value) {
		String result=null;
		try {
			String code = "1"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
			//String key = "CAPTCHA_KEY"; // 캡차 키 발급시 받은 키값
			//String value = "USER_VALUE"; // 사용자가 입력한 캡차 이미지 글자값
			System.out.println("key >>> " + key + " value >>> " + value);
			String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code + "&key=" + key + "&value="
					+ value;

			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			StringBuffer sb = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				sb.append(inputLine);
			}
			br.close();
			System.out.println("여기요여기"+sb.toString());
			result=sb.toString().substring(10,14);
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	// 비밀번호 찾기 폼
	@RequestMapping(value = "/forgetPassword.do", method = RequestMethod.GET)
	public String forgetPassword() {

		return "forgetPassword";
	}
	
	// 이메일로 비밀번호 발송
	@RequestMapping(value = "/searchPassword.do", method = RequestMethod.POST)
	public String searchPassword(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
		String userid = request.getParameter("userid");
		String useremail = request.getParameter("useremail");
		String userpw = biz.searchpassword(userid);
		
		// 잘못된 아이디를 입력했을 경우
		if(userpw == null) {
			model.addAttribute("msg", "<script type='text/javascript'>alert('아이디를 정확히 입력해 주세요.');</script>");
			return "forgetPassword";

		} else {
			// 인증 메일 보내기
			// 메일 입력값 받음
			String from = "dr2308@naver.com";
			String to = useremail;
			String subject = "On&Off에서 회원님의 비밀번호를 알려드립니다.";
			String content = "<html>" + "<div>회원님의 비밀번호는 <b>" + userpw + "</b> 입니다.</div>" + "</html>";

			Properties p = new Properties(); // 정보를 담을 객체

			p.put("mail.smtp.host", "smtp.naver.com"); // 네이버 SMTP
			// SMTP 서버에 접속하기 위한 정보들
			p.put("mail.smtp.port", "465");
			p.put("mail.smtp.starttls.enable", "true");
			p.put("mail.smtp.auth", "true");
			p.put("mail.smtp.debug", "true");
			p.put("mail.smtp.socketFactory.port", "465");
			p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			p.put("mail.smtp.socketFactory.fallback", "false");

			try {
				Authenticator auth = new SMTPAuthenticatior();
				Session ses = Session.getInstance(p, auth);

				ses.setDebug(true);

				MimeMessage msg = new MimeMessage(ses); // 메일의 내용을 담을 객체
				msg.setSubject(subject); // 제목

				Address fromAddr = new InternetAddress(from);
				msg.setFrom(fromAddr); // 보내는 사람

				Address toAddr = new InternetAddress(to);
				msg.addRecipient(Message.RecipientType.TO, toAddr); // 받는 사람

				msg.setContent(content, "text/html;charset=UTF-8"); // 내용과 인코딩

				Transport.send(msg); // 전송
			} catch (Exception e) {
				e.printStackTrace();
				// 오류 발생시 뒤로 돌아가도록
			}
			// 성공 시
			return "redirect:login.do";
		}
	}
	
	// 마이페이지
	@RequestMapping(value = "/mypage.do", method = RequestMethod.GET)
	public String mypage() {

		return "mypage";
	}
	
	// 내 정보
	@RequestMapping(value = "/myInfo.do", method = RequestMethod.GET)
	public String myInfo(Model model, HttpSession session) {
		
		if(session.getAttribute("dto")!=null) {
			model.addAttribute("dto",session.getAttribute("dto"));
		}

		return "myInfo";
	}
	
	// 탈퇴하기
	@RequestMapping(value = "/dropUser.do", method = RequestMethod.GET)
	public String dropUser(Model model, HttpSession session) {
		
		int res = biz.dropuser(session.getAttribute("id").toString());
		
		if(res > 0) {
			session.invalidate();
			return "redirect:home.do";
			
		}else {
			return "redirect:mypage.do";
		}

	}
	
	// 내 정보 수정 폼
	@RequestMapping(value = "/updateMyInfo.do", method = RequestMethod.GET)
	public String updateMyInfo(Model model, HttpSession session) {
				
		model.addAttribute("dto",biz.myinfo(session.getAttribute("id").toString()));

		return "updateMyInfo"; 
	}
	
	// 내 정보 수정하기
	@RequestMapping(value = "/updateUser.do", method = RequestMethod.POST)
	public String updateUser(Model model, HttpSession session, @ModelAttribute UserDto dto) {
		
		
		int res = biz.updateuser(dto);
		
		if(res > 0) {
			System.out.println("내정보 수정 성공");			
			session.setAttribute("dto",dto);
			return "redirect:mypage.do";
			
		}else {
			System.out.println("내정보 수정 실패");
			return "redirect:updateMyInfo.do";
		}


	}
	
	//채팅
	@RequestMapping(value="/chat.do", method=RequestMethod.GET)
    public String chat(Model model,HttpSession session) {
     
     model.addAttribute("id",session.getAttribute("id").toString());
      System.out.println(session.getAttribute("id").toString()+"controller에서 id");
     //model.addAttribute("id","dd");
     session.setAttribute("groupnum", "1");
      model.addAttribute("groupnum","1");
       return "chat";
    }
	
	//설문조사
	@Autowired
	private MoimUserBiz moimUserBiz;

	@RequestMapping(value = "/survey.do", method = RequestMethod.GET)
	public String survey(Model model, HttpServletRequest request, HttpSession session,
			@ModelAttribute MoimUserDto dto) {
		if (session.getAttribute("dto") != null) {// 로그인 되어있다면
			model.addAttribute("dto",session.getAttribute("dto"));
			if (request.getParameter("Q1") != null) {// 설문조사가 완료되면
				String userid = session.getAttribute("id").toString();
				System.out.println("userid는 " + userid);
				int Q1 = Integer.parseInt(request.getParameter("Q1"));
				int Q2 = Integer.parseInt(request.getParameter("Q2"));
				int Q3 = Integer.parseInt(request.getParameter("Q3"));
				int Q4 = Integer.parseInt(request.getParameter("Q4"));
				int Q5 = Integer.parseInt(request.getParameter("Q5"));
				String Q6 = request.getParameter("Q6");
//					   M_no, u_no는 세션에서 가져옴
				dto.setMoimno(1);
				dto.setUserid(userid);
				dto.setGroupno(0);
				dto.setMoimq1(Q1);
				dto.setMoimq2(Q2);
				dto.setMoimq3(Q3);
				dto.setMoimq4(Q4);
				dto.setMoimq5(Q5);
				dto.setMoimq6(Q6);

				int res = moimUserBiz.survey(dto);

				if (res > 0) {
					System.out.println("설문지 작성 성공!");
				} else {
					System.out.println("설문지 작성 실패");
				}

			}
		} else {// 로그인되어있지 않다면
			model.addAttribute("msg", "<script type='text/javascript'>alert('로그인해주세요.');</script>");
			return "login";
		}

		return "survey";
	} 
	
	@RequestMapping(value = "/D3.do", method = RequestMethod.GET)
	public String D3(Model model, @ModelAttribute MoimUserDto dto) {
		dto.setMoimno(1);//평균내고싶은 모임번호 넣음. 이전 페이지에서 에서 값 받아욤
		int avgQ1 = (int)moimUserBiz.avgQ1(dto);
		int avgQ2 = (int)moimUserBiz.avgQ2(dto);
		int avgQ3 = (int)moimUserBiz.avgQ3(dto);
		int avgQ4 = (int)moimUserBiz.avgQ4(dto);
		int avgQ5 = (int)moimUserBiz.avgQ5(dto);
		int avgAll = (int)moimUserBiz.avgAll(avgQ1, avgQ2, avgQ3, avgQ4, avgQ5);
//		System.out.println("1번모임1번질문"+avgQ1);
//		System.out.println("1번모임2번질문"+avgQ2);
//		System.out.println("1번모임3번질문"+avgQ3);
//		System.out.println("1번모임4번질문"+avgQ4);
//		System.out.println("1번모임5번질문"+avgQ5);
//		System.out.println("1번모임의 평균"+avgall);
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(avgQ1);
		array.add(avgQ2);
		array.add(avgQ3);
		array.add(avgQ4);
		array.add(avgQ5);
		array.add(avgAll);
		model.addAttribute("array",array);
		
		return "D3";
	}
	
	
	
	
	//테스트 메소드
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String test(Model model, HttpSession session) {
				
		

		return "myCal";
	}
	
}