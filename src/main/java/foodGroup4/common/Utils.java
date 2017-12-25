package foodGroup4.common;

import foodGroup4.dto.CartInfoDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Utils {
    public static CartInfoDto getCartInfoFromSession(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        CartInfoDto cartInfo = (CartInfoDto) session.getAttribute("cartInfo");
        if(cartInfo == null) {
            cartInfo = new CartInfoDto();
            session.setAttribute("cartInfo", cartInfo);
        }
        return cartInfo;
    }

    public static void removeCartInfoSession(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        session.removeAttribute("cartInfo");
    }
}
