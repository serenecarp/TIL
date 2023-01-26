package test04_multiple_extends;

// 다중 상속: extends 뒤에 ,(콤마)로 나열
public interface DuckInterface extends AbleToFly, AbleToHunt, AbleToSwim {
	void playInnocent();
}
