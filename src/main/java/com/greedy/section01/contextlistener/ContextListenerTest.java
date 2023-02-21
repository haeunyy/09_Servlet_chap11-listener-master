package com.greedy.section01.contextlistener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


/* ServletContextListener, ServletContextAttributeListener 를 구현한다. */
@WebListener
public class ContextListenerTest implements ServletContextListener, ServletContextAttributeListener {

	// 다양한 이벤트를 클래스안에서 구현한다. 
	
    /* context가 생성 될 때 변화를 감지하는 Listener 인스턴스가 함께 생성 된다. */
    public ContextListenerTest() {
    	System.out.println("context listener 인스턴스 생성");  // 생성자가 호출된다. 
    }

    /* context에 attribute가 추가 될 때 동작한다. */
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
    	System.out.println("context attribute added!!");
    }

    /* context에 attribute가 제거 될 때 동작한다. */
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    	System.out.println("context attribute removed!!");
    }
    
    /* context가 소멸할 때 동작한다. */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("context destoryed!!");
    }

    /* context에 attribute가 교체 될 때 동작한다. */
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	System.out.println("context attribute replaced!!");
    }

    /* context가 초기화 될 때 동작한다. */
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("context initialized!!");
    }
	
}
