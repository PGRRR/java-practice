package ch6;

public class NewIdCodingTest0414 {

	public static void main(String[] args) {
		String new_id = ".";
		new_id = new_id.toLowerCase();
		new_id = new_id.replaceAll("[^a-z0-9-_.]","");
        new_id = new_id.replace("...", ".");
		new_id = new_id.replace("..", ".");
        new_id = new_id.replaceAll("^[.]|[.]$", "");
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
		}
        new_id = new_id.replaceAll("[.]$", "");
        if (new_id.isEmpty()) {
            new_id += "a";
        }
		if(new_id.length() <= 2 && new_id.length() > 0) {
			while (new_id.length() < 3) {
			new_id += new_id.substring(new_id.length() - 1);
			}
		} else if (new_id.isEmpty()) {
			new_id += "a";
		}
		System.out.println(new_id);
	}
}
