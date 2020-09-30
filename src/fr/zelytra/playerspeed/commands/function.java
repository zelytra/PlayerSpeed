package fr.zelytra.playerspeed.commands;



public class function {
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	public static String prefix () {
		String prefix = "§3[§bPlayerSpeed§3]§r ";
		return prefix;
	}

}
