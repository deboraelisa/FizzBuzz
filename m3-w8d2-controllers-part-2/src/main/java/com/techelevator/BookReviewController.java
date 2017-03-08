package com.techelevator;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class BookReviewController {

	@Autowired
	ReviewDao reviewDao;
	
	@RequestMapping("/")
	public String showHomePage(HttpServletRequest request) {
		List<Review> reviewList = reviewDao.getAllReviews();
		
		request.setAttribute("reviewList", reviewList);
		
		return "greeting";
	}
	
	@RequestMapping(path="/bookReviewPage", method=RequestMethod.GET)
	public String showBookReviewInput() {
		return "bookReviewPage";
	}
	
	@RequestMapping(path="/bookReviewPage", method=RequestMethod.POST)
	public String processBookReview(Review review) {
		review.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(review);
		return "redirect:/bookReviewPage";
	}
	

}
