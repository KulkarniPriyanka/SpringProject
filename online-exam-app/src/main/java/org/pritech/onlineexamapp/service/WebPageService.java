package org.pritech.onlineexamapp.service;

import org.pritech.onlineexamapp.jpa.entity.WebPageDetails;
import org.pritech.onlineexamapp.repository.WebPageDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WebPageService {
	
	@Autowired
	private WebPageDetailsRepository webPageDetailsRepository;
	
	public WebPageDetails displayWebPage(String pageName){
		WebPageDetails webPage = webPageDetailsRepository.findByPageName(pageName);
		return webPage;
	}
	

}
