package oops.concept.inheritance;

import oops.concept.abstration.AbstractHuman;

public class Male extends AbstractHuman{

	Male male = this;
	public Male(String name, int age, String gender) {
		super(name, age, gender);
	}

	@Override
	public String getDetails() {
		
		return male.name+male.getDetails();
	}

}
