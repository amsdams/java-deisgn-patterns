package demo;

import api.Service;
import api.ServiceLocator;

public class ServiceLocatorDemo {
    public static void main(String[] args) {
	Service service = ServiceLocator.getService("Service1");
	service.execute();
	service = ServiceLocator.getService("Service2");
	service.execute();
	service = ServiceLocator.getService("Service1");
	service.execute();
	service = ServiceLocator.getService("Service2");
	service.execute();
    }
}
