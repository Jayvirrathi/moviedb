package com.moviedatabase.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String sayDefault() {

		return "index";
	}

	@GetMapping("/404")
	public String say404() {

		return "404";
	}

	@GetMapping("/blogdetail_light")
	public String sayblogdetail_light() {

		return "blogdetail_light";
	}

	@GetMapping("/blogdetail")
	public String sayblogdetail() {

		return "blogdetail";
	}

	@GetMapping("/bloggrid_light")
	public String saybloggrid_light() {

		return "bloggrid_light";
	}

	@GetMapping("/bloggrid")
	public String saybloggrid() {

		return "bloggrid";
	}

	@GetMapping("/bloglist_light")
	public String saybloglist_light() {

		return "bloglist_light";
	}

	@GetMapping("/bloglist")
	public String saybloglist() {

		return "bloglist";
	}

	@GetMapping("/celebritygrid01_light")
	public String saycelebritygrid01_light() {

		return "celebritygrid01_light";
	}

	@GetMapping("/celebritygrid01")
	public String saycelebritygrid01() {

		return "celebritygrid01";
	}

	@GetMapping("/celebritygrid02_light")
	public String saycelebritygrid02_light() {

		return "celebritygrid02_light";
	}

	@GetMapping("/celebritygrid02")
	public String saycelebritygrid02() {

		return "celebritygrid02";
	}

	@GetMapping("/celebritylist_light")
	public String saycelebritylist_light() {

		return "celebritylist_light";
	}

	@GetMapping("/celebritylist")
	public String saycelebritylist() {

		return "celebritylist";
	}

	@GetMapping("/celebritysingle_light")
	public String saycelebritysingle_light() {

		return "celebritysingle_light";
	}

	@GetMapping("/celebritysingle")
	public String saycelebritysingle() {

		return "celebritysingle";
	}

	@GetMapping("/comingsoon")
	public String saycomingsoon() {

		return "comingsoon";
	}

	@GetMapping("/homev2_light")
	public String sayhomev2_light() {

		return "homev2_light";
	}

	@GetMapping("/homev2")
	public String sayhomev2() {

		return "homev2";
	}

	@GetMapping("/homev3_light")
	public String sayhomev3_light() {

		return "homev3_light";
	}

	@GetMapping("/homev3")
	public String sayhomev3() {

		return "homev3";
	}

	@GetMapping("/index_light")
	public String sayindex_light() {

		return "index_light";
	}

	@GetMapping("/index-2")
	public String sayindex2() {

		return "index-2";
	}

	@GetMapping("/index")
	public String sayindex() {

		return "index";
	}

	@GetMapping("/landing")
	public String saylanding() {

		return "landing";
	}

	@GetMapping("/moviegrid_light")
	public String saymoviegrid_light() {

		return "moviegrid_light";
	}

	@GetMapping("/moviegrid")
	public String saymoviegrid() {

		return "moviegrid";
	}

	@GetMapping("/moviegridfw_light")
	public String saymoviegridfw_light() {

		return "moviegridfw_light";
	}

	@GetMapping("/moviegridfw")
	public String saymoviegridfw() {

		return "moviegridfw";
	}

	@GetMapping("/movielist_light")
	public String saymovielist_light() {

		return "movielist_light";
	}

	@GetMapping("/movielist")
	public String saymovielist() {

		return "movielist";
	}

	@GetMapping("/moviesingle_light")
	public String saymoviesingle_light() {

		return "moviesingle_light";
	}

	@GetMapping("/moviesingle")
	public String saymoviesingle() {

		return "moviesingle";
	}

	@GetMapping("/seriessingle_light")
	public String sayseriessingle_light() {

		return "seriessingle_light";
	}

	@GetMapping("/seriessingle")
	public String sayseriessingle() {

		return "seriessingle";
	}

	@GetMapping("/userfavoritegrid_light")
	public String sayuserfavoritegrid_light() {

		return "userfavoritegrid_light";
	}

	@GetMapping("/userfavoritegrid")
	public String sayuserfavoritegrid() {

		return "userfavoritegrid";
	}

	@GetMapping("/userfavoritelist_light")
	public String sayuserfavoritelist_light() {

		return "userfavoritelist_light";
	}

	@GetMapping("/userfavoritelist")
	public String sayuserfavoritelist() {

		return "userfavoritelist";
	}

	@GetMapping("/userprofile_light")
	public String sayuserprofile_light() {

		return "userprofile_light";
	}

	@GetMapping("/userprofile")
	public String sayuserprofile() {

		return "userprofile";
	}

	@GetMapping("/userrate_light")
	public String sayuserrate_light() {

		return "userrate_light";
	}

	@GetMapping("/userrate")
	public String sayuserrate() {

		return "userrate";
	}

	@GetMapping("/login")
	public String sayLogin() {

		return "login";
	}

	@GetMapping("/signup")
	public String saySignUp() {

		return "signup";
	}

	@GetMapping("/forgot")
	public String sayforgot() {

		return "forgot";
	}
	
}
