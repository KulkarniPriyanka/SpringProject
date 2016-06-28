package org.pritech.onlineexamapp.repository;

import org.pritech.onlineexamapp.jpa.entity.WebPageDetails;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WebPageDetailsRepository extends JpaRepository<WebPageDetails, Integer> {

	public WebPageDetails findByPageName(String pageName);
}
