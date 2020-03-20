/*today point
 * [상속관계]에서 override : 상속관계에서 메서드 [재정의]
 * 상속이 없으면, override도 존재하지 않는다.
 * [상속관계]에서 [자식 클래스]가 [부모 클래스]의 [메서드]를 [재정의](내용 바꾼다.)
 * 재정의 : 틀의 변환(함수의 이름, 타입을 바꾸는것)을 하는 것이 아니고, 내용만 바꾼다.
 * 문법)
 * 1. 부모함수 이름 동일
 * 2. 부모함수 parameter 동일
 * 3. 부모함수 return type 동일
 * 4. 결국.. [실행 블럭 안의 내용만 바꿀 수 있어요]
 * ****************오버로딩은 하나의 이름으로 여러가지 기능을 합니다. 오버라이드는 상속관계에서 재정의를 합니다.*******************"`':.
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
	//부모의 함수와 틀이 똑같아요 > 내용만 틀려요
	// [재정의]
	@Override 
	//annotation 개발 툴 에게 알려주는 용도. 하나의 약속임.
	//Annotation 은 java code만으로 전달할 수 없는 [부가적인 정보]를 [컴파일러],[개바툴]에 전달
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
