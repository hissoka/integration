package com.esprit.integrationContinue;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.esprit.integrationContinue.Test.Calculator;
import com.esprit.integrationContinue.model.Operande;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	@Resource(name = "calculatriceService")
	private Calculator calculator;

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/somme", method = RequestMethod.GET)
	public String getAdd(Model model) {
		model.addAttribute("nombres", new Operande());
		return "pageSomme";
	}

	@RequestMapping(value = "/somme", method = RequestMethod.POST)
	public String add(@ModelAttribute(value = "nombres") Operande operande,
			Model model) {
		Integer somme = calculator.sum(operande.getOperande1(),
				operande.getOperande2());
		model.addAttribute("somme", somme);
		return "pageSommeCalculee";
	}

}
