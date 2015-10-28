package demo;

import api.AuthenticationFilter;
import api.Client;
import api.DebugFilter;
import api.FilterManager;
import api.Target;

public class InterceptingFilterDemo {

    public static void main(String[] args) {
	FilterManager filterManager = new FilterManager(new Target());
	filterManager.setFilter(new AuthenticationFilter());
	filterManager.setFilter(new DebugFilter());

	Client client = new Client();
	client.setFilterManager(filterManager);
	client.sendRequest("HOME");

    }

}
