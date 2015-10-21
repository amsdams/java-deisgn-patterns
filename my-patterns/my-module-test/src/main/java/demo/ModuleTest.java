package demo;

import java.io.File;
import java.io.IOException;

import api.Project;
import api.Module;

public class ModuleTest {

    public static void main(String[] args) throws IOException {
	File temp = new File(".");
	File currentModule = new File(temp.getCanonicalPath());

	File currentProject = currentModule.getParentFile();

	Project project = new Project(currentProject.getCanonicalPath());
	System.out.println("project artifact: " + project.toString());

	if (!project.isHasModel()) {
	    System.out.println("no model");
	}

	if (!project.isHasReadme()) {
	    System.out.println("no readme");
	}

	File[] files = currentProject.listFiles();
	for (File file : files) {

	    if (file.isDirectory() && !file.getName().equals("src") && !file.getName().startsWith(".")) {
		Module module = new Module(file.getCanonicalPath());
		System.out.println("module artifact: " + module.toString());
		if (!module.isHasMain()) {
		    System.out.println("no main");
		}

		if (!module.isHasModel()) {
		    System.out.println("no model");
		}

		if (!module.isHasReadme()) {
		    System.out.println("no readme");
		}

		if (!module.isHasTest()) {
		    System.out.println("no test");
		}
	    }
	}

    }

}
