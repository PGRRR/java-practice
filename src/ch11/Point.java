package ch11;

public class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y : " + y;
	}

	class Point3D extends Point {
		int z;
		Point3D(int x, int y, int z) {
			super(x, y);

			this.z = z;
		}

		String getLocation() {
			return "x : " + x + ", y : " + y + ", z : " + z;
		}
	}

	class PointTest {
		public static void main(String[] args) {
			
		}
	}
}
