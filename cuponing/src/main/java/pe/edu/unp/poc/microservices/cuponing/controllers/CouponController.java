package pe.edu.unp.poc.microservices.cuponing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.unp.poc.microservices.cuponing.models.Coupon;
import pe.edu.unp.poc.microservices.cuponing.services.CouponService;

import java.util.List;

@RestController("coupons")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @GetMapping
    @ResponseBody
    public List<Coupon> allCoupons() {
        return couponService.getAll();

    }

}
