package com.husTravel.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.husTravel.entity.Image;

public interface ImageService {

	List<Image> findByTourId(Long id);

	public Image addToTour(Long tourId,String url);

	void deleteById(Long id);
}
