package foodGroup4.common;

import foodGroup4.entity.Khachhang;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CustomUserDetails extends User {

    private String ten;

    public CustomUserDetails(Khachhang khachhang, Collection<? extends GrantedAuthority> authorities) {
        super(khachhang.getSdt(), khachhang.getPassword(), authorities);
        this.ten = khachhang.getTen();
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
