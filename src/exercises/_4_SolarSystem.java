package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _4_SolarSystem {

	public static void main(String[] args) {
		List<Planet> planets = Arrays.asList(
				new Planet("Mercury", 57, 0.056, 0),
				new Planet("Venus", 108, 0.866, 0),
				new Planet("Jupiter", 779, 1321, 79),
				new Planet("Mars", 228, 0.151, 2),
				new Planet("Earth", 150, 1, 1),
				new Planet("Saturn", 1430, 763.59, 62)
				);

		// 1: Sort the planets by distance from the sun
		System.out.println("Planets sorted by distance from the sun:");
		Collections.sort(planets, Collections.reverseOrder((p1, p2) -> p2.getDistanceFromSun() - p1.getDistanceFromSun()));		
		for(int i=0;i<planets.size();i++){
		    System.out.println(planets.get(i).getName() + " " + planets.get(i).getDistanceFromSun());
		} 		
		
		// 2. Sort the planets in alphabetical order
		planets.sort(Comparator.comparing(Planet::getName));
		System.out.println("Planets sorted by alphabetical order:");
		for(int i=0;i<planets.size();i++){
		    System.out.println(planets.get(i).getName());
		} 		
		
		// 3. Sort planets from largest to smallest
		planets.sort(Collections.reverseOrder(Comparator.comparing(Planet::getVolume)));
		System.out.println("Planets sorted by volume:");		
		for(int i=0;i<planets.size();i++){
		    System.out.println(planets.get(i).getName() + " " + planets.get(i).getVolume());
		} 		
		
	}
}

