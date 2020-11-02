package gsmClass;

abstract class PlayerLevel {
	abstract void run();
	abstract void jump();
	abstract void turn();
	abstract void showLevel();

	void go(int count) {
		run();
		for (int i = 0; i < count; i++)
			jump();
		turn();
	}
}

class BeginnerLevel extends PlayerLevel {
	@Override
	void showLevel() {
		System.out.println("***Beginner Level***");
	}

	@Override
	void run() {
		System.out.println("õõ�� run");
	}

	@Override
	void jump() {
		System.out.println("���� jump");
	}

	@Override
	void turn() {
		System.out.println("������ turn");
	}

}

class AdvancedLevel extends PlayerLevel {
	@Override
	void showLevel() {
		System.out.println("***Advenced Level***");
	}

	@Override
	void run() {
		System.out.println("run");
	}

	@Override
	void jump() {
		System.out.println("jump");
	}

	@Override
	void turn() {
		System.out.println("turn");
	}

}

class SuperLevel extends PlayerLevel {
	@Override
	void showLevel() {
		System.out.println("***Super Level***");
	}

	@Override
	void run() {
		System.out.println("������ run");
	}

	@Override
	void jump() {
		System.out.println("���� jump");
	}

	@Override
	void turn() {
		System.out.println("������ turn");
	}

}

class Player {
	PlayerLevel level;

	Player() {
		level = new BeginnerLevel();
		level.showLevel();
	}

	void levelUp(PlayerLevel level) {
		this.level = level;
		level.showLevel();
	}

	void play(int count) {
		level.go(count);
	}
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		Player p = new Player();
		p.play(1);
		p.levelUp(new AdvancedLevel());
		p.play(2);
		p.levelUp(new SuperLevel());
		p.play(3);

	}

}
