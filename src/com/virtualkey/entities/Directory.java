package com.virtualkey.entities;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class Directory {

	   public static final String name = "C:\\Users\\hp\\eclipse-workspace\\LockedMe.com\\src\\directories\\";

	   //TODO: Possibly use a HashMap? Too complex for now.
	    private ArrayList<File> files = new ArrayList<File>();
	    
	    Path path = FileSystems.getDefault().getPath(name).toAbsolutePath();
	    
	    File Dfiles = path.toFile();
	       
	    public String getName() {
	        return name;
	    }
	    
	    public void print() {
	    	System.out.println("Existing Files: ");
	    	files.forEach(f -> System.out.println(f));
	    }

	    public ArrayList<File> fillFiles() {
	    	
	        File[] directoryFiles = Dfiles.listFiles();
	        
	        
	        
	    	files.clear();
	    	for (int i = 0; i < directoryFiles.length; i++) {
	    		if (directoryFiles[i].isFile()) {
	    			files.add(directoryFiles[i]);
	    		}
	    	}
	    	
	    	Collections.sort(files);
	    	
	    	return files;
	    }

	    public ArrayList<File> getFiles() {
	    	
	    	fillFiles();
	    	return files;
	    }
	    
	    
	    public void mergeSort() {
	    	
	    }
	    
	}
