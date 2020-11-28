package pe.edu.unp.poc.microservices.cuponing.services;

import org.springframework.stereotype.Service;
import pe.edu.unp.poc.microservices.cuponing.models.Coupon;

import java.util.ArrayList;
import java.util.List;

@Service
public class CouponService {

    public List<Coupon> getAll() {
        List<Coupon> coupons = new ArrayList<>();

        coupons.add(new Coupon("1", "Cupón de descuento", 10.00));
        coupons.add(new Coupon("2", "Cupón de descuento", 15.00));
        coupons.add(new Coupon("3", "Cupón de descuento", 20.00));

        return coupons;
    }
}
