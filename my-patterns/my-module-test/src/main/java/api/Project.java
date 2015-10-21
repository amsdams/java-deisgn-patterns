package api;

import java.io.File;

public class Project {

    protected boolean hasReadme;
    protected boolean hasModel;
    protected String path;

    public Project(String path) {
	this.path = path;
	Verify();
    }

    public boolean isHasReadme() {
	return hasReadme;
    }

    public boolean isHasModel() {
	return hasModel;
    }

    public void Verify() {
	File artifactFile = new File(this.path);
	File[] artifactFiles = artifactFile.listFiles();
	for (File f : artifactFiles) {
	    if (f.getName().equals("Readme.md")) {
		this.hasReadme = true;
	    }
	    if (f.getName().equals("pom.xml")) {
		this.hasModel = true;
	    }

	}
    }

    @Override
    public String toString() {
	return "Project [hasReadme=" + hasReadme + ", hasModel=" + hasModel + ", path=" + path + "]";
    }

}