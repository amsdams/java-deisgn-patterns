package demo;

import api.FrontController;

public class FrontControllerDemo {

    public static void main(String[] args) {
	FrontController frontController = new FrontController();
	frontController.dispatchRequest("HOME");
	frontController.dispatchRequest("STUDENT");

    }

}
