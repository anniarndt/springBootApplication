package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class HelloController {

	
    String urlstring = "www.api.github.com/repos";
    Url url = new Url(urlstring);
    UrlConnection conn = url.openConnection();
    InputStream is = conn.getInputStream();

	 //--------------------retrieve a Profile--------------
	 @RequestMapping("/", method = RequestMethod.GET)
	 public String index() {
		 return "Retrieved a profile!";
	 }

	 
	 //--------------------save Profile in Database--------------
	 @RequestMapping("/", method = RequestMethod.POST)
	 public String index() {
		 return "Saved a profile to the database!";
	 } // braucht man diese POST-Methode eigentlich??
	 // Oder kann das nicht über die GET-Request direkt erledigt werden?

	
	@RequestMapping("/test")
	public String index2() {
		return "Greetings Test Page!";
	}

	public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
