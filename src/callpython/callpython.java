package callpython;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class callpython {
	public static void main(String[] args) {
		String s = null;
		try {
			Process p = Runtime.getRuntime().exec("py src\\callpython\\number.py");

			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

			// read the output from the command
			System.out.println("Here is the standard output of the command:\n");
			while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
