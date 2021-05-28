import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class FirstBigO {

	public static void main(String[] args) {
		Instant start = Instant.now();
		String[] nemo = new String[100];
		Arrays.fill(nemo, "nemo");
		for(int i=0;i<nemo.length;i++) {
			if(nemo[i].equalsIgnoreCase("nemo"))
				System.out.println("Nemo is found!");
		}
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println(timeElapsed);
	}

}