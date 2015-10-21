package api;

import java.io.File;

public class Module extends Project {

    private boolean hasMain;
    private boolean hasTest;

    public Module(String path) {
	super(path);
	super.Verify();

    }

    public void Verify() {

	File main = new File(path + "/src/main/java/");

	if (main.exists() && main.list().length > 0) {
	    this.hasMain = true;

	}

	File test = new File(path + "/src/test/java/");

	if (test.exists() && test.list().length > 0) {
	    this.hasTest = true;

	}

    }

    public boolean isHasMain() {
	return hasMain;
    }

    public boolean isHasTest() {
	return hasTest;
    }

    @Override
    public String toString() {
	return "Module [hasMain=" + hasMain + ", hasTest=" + hasTest + ", hasReadme=" + hasReadme + ", hasModel="
		+ hasModel + ", path=" + path + "]";
    }

}
