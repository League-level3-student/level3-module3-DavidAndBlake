import java.util.ArrayList;

public class MonsterRegistry {

	public static void main(String[] args) {
		ArrayList<Monster> MonsterRegistry = new ArrayList<>();
		Monster Tiger = new Tiger();
		Monster Demon = new Demon();
		Monster Dragon = new Dragon();
		Monster God = new God();
		MonsterRegistry.add(Tiger);
		MonsterRegistry.add(Demon);
		MonsterRegistry.add(Dragon);
		MonsterRegistry.add(God);
		for (int i = 0; i < MonsterRegistry.size(); i++) {
			MonsterRegistry.get(i).makeNoise();
			MonsterRegistry.get(i).takeAShit();
		}

	}

}
