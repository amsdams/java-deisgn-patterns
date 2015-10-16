package demo;

import api.SingleObject;

public class SingletonDemo {
	public static void main(String[] args) {
	//illegal construct
    //Compile Time Error: The constructor SingleObject() is not visible
    //SingleObject object = new SingleObject();

    //Get the only object available
    SingleObject singleObject = SingleObject.getInstance();
    singleObject.setMessage("blala");
    
    SingleObject singleObject2 = SingleObject.getInstance();
    singleObject2.setMessage("amsdams");
    //show the message
    singleObject.showMessage();
    singleObject2.showMessage();
	}
}
