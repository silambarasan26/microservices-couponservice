package com.srteck.coupon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.srteck.coupon.model.Coupon;
import com.srteck.coupon.repos.CouponRepo;

@RestController
@RequestMapping(value = "/couponapi")
public class CouponController {

	@Autowired
	private CouponRepo couponRepo;
	
	@RequestMapping(value = "/coupon", method = RequestMethod.POST)
	public Coupon saveCoupon(@RequestBody Coupon coupon) {
		return couponRepo.save(coupon);
		
	}
	
	@RequestMapping(value = "/coupon/{code}", method = RequestMethod.GET)
	public Coupon getCoupon(@PathVariable String code) {
		return couponRepo.getCouponByCode(code);
		
	}
	
	
	
}
