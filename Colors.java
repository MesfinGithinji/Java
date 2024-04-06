/*
public class colors {
	enum Color { 
		RED,
		ORANGE,
		GREEN;
	}

	public static void main (String[] args){
		Color[] trafficLights = Color.values();

		System.out.println(trafficLights[0] + " means stop");
		System.out.println(trafficLights[1] + " means get ready");
		System.out.println(trafficLights[2] + " means GO");
	}
} */

public class Colors {
    enum Color { //here we are declaring an enum type called Color with a string representation of its meaning
        RED("stop"),
        ORANGE("get ready"),
        GREEN("GO");
	
	//meaning is private(can't be accessed outside this class)
	//its also final thus immutable
        private final String meaning;
	
	//constructor for the enum color and intialising its string meaning
        Color(String meaning) {
            this.meaning = meaning;
        }
	
	//A method that returns the string meaning 
        public String getMeaning() {
            return meaning;
        }
    }

    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color + " means " + color.getMeaning());
        }
    }
}
