package demo;

import api.Client;

public class CompositeEntityDemo {
    public static void main(String[] args) {

	Client client = new Client();
	client.setData("Test", "Data");
	client.printData();
	client.setData("Second Test", "Data1");
	client.printData();
    }
}