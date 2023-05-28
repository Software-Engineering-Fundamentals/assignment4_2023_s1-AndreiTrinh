package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Employee in an organisation
 */
public class Employee {
    
    private String n1;
    
    private ArrayList<String> e1 = new ArrayList<String>();
    
    private ArrayList<String> k1 = new ArrayList<String>();
    private ArrayList<String> p1 = new ArrayList<String>();
    
    private int ID;

    private String department;

    public String get_n1() {
        return n1;
    }

    public void set_n1(String n1) {
        this.n1 = n1;
    }

    
    public void assignProjects(int ID,  string p) {
        this.ID = id;
	   for (int i = 0; i < e1.length; i++) {
  			if e1[i]==p {
				for (int i = 0; i < k1.length; i++) {
				if k1[i]==p {
					 System.out.println("The action cannot be completed")
                           } 

				}
			}
	    }
    }

    

    public void assignNewProjects(int ID,  string p) {
        this.p1.add(p);
    }


}
