/*today point
 * [��Ӱ���]���� override : ��Ӱ��迡�� �޼��� [������]
 * ����� ������, override�� �������� �ʴ´�.
 * [��Ӱ���]���� [�ڽ� Ŭ����]�� [�θ� Ŭ����]�� [�޼���]�� [������](���� �ٲ۴�.)
 * ������ : Ʋ�� ��ȯ(�Լ��� �̸�, Ÿ���� �ٲٴ°�)�� �ϴ� ���� �ƴϰ�, ���븸 �ٲ۴�.
 * ����)
 * 1. �θ��Լ� �̸� ����
 * 2. �θ��Լ� parameter ����
 * 3. �θ��Լ� return type ����
 * 4. �ᱹ.. [���� �� ���� ���븸 �ٲ� �� �־��]
 * ****************�����ε��� �ϳ��� �̸����� �������� ����� �մϴ�. �������̵�� ��Ӱ��迡�� �����Ǹ� �մϴ�.*******************"`':.
 */
class Point2{
	int x=4;
	int y=5;
	String getPosition() {
		return "x: "+this.x+"y: "+this.y;
	}
	
}
class Point3D extends Point2{
	int z=6;
	//�θ��� �Լ��� Ʋ�� �Ȱ��ƿ� > ���븸 Ʋ����
	// [������]
	@Override 
	//annotation ���� �� ���� �˷��ִ� �뵵. �ϳ��� �����.
	//Annotation �� java code������ ������ �� ���� [�ΰ����� ����]�� [�����Ϸ�],[������]�� ����
	String getPosition() {
		return "x: "+this.x+" y: "+this.y+" z: "+this.z;
	}	
}
public class Ex04_Inherit_override {
	public static void main(String[] args) {
	    Point3D po = new Point3D();
	    System.out.println(po.getPosition());
	    
	}
}
