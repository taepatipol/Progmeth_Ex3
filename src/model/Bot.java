package model;

public abstract class Bot implements Worker{
	public static int material;
	public static int finishedProduct;
	public abstract void work();
	public Bot() {
		this.material = 20;
		this.finishedProduct = 0;
	}
}
