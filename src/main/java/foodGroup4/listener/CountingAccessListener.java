package foodGroup4.listener;

import foodGroup4.service.TrungtamService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@Component
public class CountingAccessListener implements HttpSessionListener, ApplicationContextAware {
    public void setTrungtamService(TrungtamService trungtamService) {
        this.trungtamService = trungtamService;
    }

    @Autowired
    TrungtamService trungtamService;

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        trungtamService.increaseCountingAccess();
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (applicationContext instanceof WebApplicationContext) {
            ((WebApplicationContext) applicationContext).getServletContext().addListener(this);
        } else {
            //Either throw an exception or fail gracefully, up to you
            throw new RuntimeException("Must be inside a web application context");
        }
    }
}
