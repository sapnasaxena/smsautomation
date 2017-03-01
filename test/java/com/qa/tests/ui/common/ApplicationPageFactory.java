package com.qa.tests.ui.common;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ApplicationPageFactory {
	
	public static <T> T initElements(WebDriver driver, Class<T> pageClassToProxy)
    {
        T page = instantiatePage(driver, pageClassToProxy);
        PageFactory.initElements(driver, pageClassToProxy);
        return page;
    }


	
	
    //private static <T> T instantiatePage(WebDriver driver, Class<T> pageClassToProxy) {
    private static <T> T instantiatePage(WebDriver driver, Class<T> pageClassToProxy)
    {
        try {
            try {
                Constructor<T> constructor = pageClassToProxy.getConstructor(WebDriver.class);
                return constructor.newInstance(driver);
            }
            catch (NoSuchMethodException e) {
                return pageClassToProxy.newInstance();
            }
        }
        catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

}
