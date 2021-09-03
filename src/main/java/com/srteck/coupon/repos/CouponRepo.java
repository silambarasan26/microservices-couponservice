package com.srteck.coupon.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srteck.coupon.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon getCouponByCode(String code);

}
