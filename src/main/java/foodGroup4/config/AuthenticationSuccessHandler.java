package foodGroup4.config;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class AuthenticationSuccessHandler.
 */
@Component
public class AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	/** The token handler. */
	@Autowired
	private TokenHandler tokenHandler;

	/** The redirect strategy. */
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	/* (non-Javadoc)
	 * @see org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler#onAuthenticationSuccess(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.core.Authentication)
	 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		handle(request, response, authentication);
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.web.authentication.AbstractAuthenticationTargetUrlRequestHandler#handle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.core.Authentication)
	 */
	protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException {

		determineTargetUrl(authentication, request);

		if (response.isCommitted()) {
			logger.error("Response has already been committed. Unable to redirect to " + "/admin/");
			return;
		}

		redirectStrategy.sendRedirect(request, response, "/admin/");
	}

	/**
	 * Determine target url.
	 *
	 * @param authentication the authentication
	 * @param request the request
	 */
	protected void determineTargetUrl(Authentication authentication, HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		User user = (User) authentication.getPrincipal();

		String role = "";
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		for (GrantedAuthority grantedAuthority : authorities) {
			role += grantedAuthority.toString();
		}

		httpSession.setAttribute("role", role);
		httpSession.setAttribute("username", user.getUsername());
		httpSession.setAttribute("jwt", tokenHandler.createTokenForUser(role));
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.web.authentication.AbstractAuthenticationTargetUrlRequestHandler#setRedirectStrategy(org.springframework.security.web.RedirectStrategy)
	 */
	public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
		this.redirectStrategy = redirectStrategy;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.web.authentication.AbstractAuthenticationTargetUrlRequestHandler#getRedirectStrategy()
	 */
	protected RedirectStrategy getRedirectStrategy() {
		return redirectStrategy;
	}
}
