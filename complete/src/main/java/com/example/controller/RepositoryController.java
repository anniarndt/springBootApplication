@RestController
@RequestMapping("/api")
public class RepositoryController {

    String urlstring = "www.api.github.com/repos";
    Url url = new Url(urlstring);
    UrlConnection conn = url.openConnection();
    InputStream is = conn.getInputStream();


    //--------------------retrieve a Repository--------------
	@RequestMapping("/", method = RequestMethod.GET)
	public String index() {
		return "Greetings from Spring Boot!";
	}

	
	@RequestMapping("/test")
	public String index2() {
		return "Greetings Test Page!";
	}

	public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    // offene Fragen:
    // Braucht man einen Url-Builder?
}
