package main;
public class Banking { 

    public static int Savemoney(int x, int y) {
        if (x <= 1) {
            return y;
        }
        while(x > 1) {
            y = y * 110 / 100;
            x = x - 1;
        }
        return y;
    }

	public static void main(String[] args) { 
		int x = 1, y = 2;
	} 
}