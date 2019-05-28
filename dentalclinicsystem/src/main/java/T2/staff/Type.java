package T2.staff;

public enum Type {
	Receptionist, Dentist, DCA;

	public static String[] enumsToStringArray() {
		String[] results = new String[Type.values().length];
		int count =0;
		for(Type each: Type.values());
		count++;
		return results;
	}
}
