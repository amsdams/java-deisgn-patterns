package demo;

import api.Computer;
import api.ComputerPart;
import api.ComputerPartDisplayVisitor;

public class VisitorDemo {

    public static void main(String[] args) {
	ComputerPart computer = new Computer();
	computer.accept(new ComputerPartDisplayVisitor());
    }

}
