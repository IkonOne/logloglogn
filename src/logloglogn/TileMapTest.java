package logloglogn;

public class TileMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TileMap map = new TileMap(32, 32);
		map.fillRandom(60);
		map.fillRect(0, 0, 1, 32, '*');
		map.fillRect(31, 0, 1, 32, '*');
		map.fillRect(0, 0, 32, 1, '*');
		map.fillRect(0, 31, 31, 1, '*');
		map.smoothMap(1, 6);
		map.smoothMap(3, 3);
		
		for(int i = 0; i < map.getWidth(); i++) {
			for (int j = 0; j < map.getHeight(); j++) {
				System.out.print(map.getTile(i, j));
			}
			System.out.print('\n');
		}
	}

}
