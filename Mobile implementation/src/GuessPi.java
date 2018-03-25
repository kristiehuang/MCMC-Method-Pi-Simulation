import java.util.*;

/* This is the implementation of the Monte Carlo algorithm used to 
approximate the value of pi.
*/
public class GuessPi {
	private int circle_points = 0;
	private int square_points = 0;
	private double rand_x, rand_y;
	private double origin_distance;
	private Random rand = new Random();

	public double piGuesser(int sampleSize) {
		for(int i = 0; i < sampleSize * sampleSize; i++) {
			rand_x = rand.nextDouble();
			rand_y = rand.nextDouble();
			origin_distance = (rand_x * rand_x) + (rand_y * rand_y);
			if(origin_distance <= 1) {
				circle_points++;
			}
			square_points++;
		}
		return 4 * ((double) circle_points / (double) square_points);
	}

}