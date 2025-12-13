// 패키지 선언
package ch06.Ex12.hyundai;

/**
 * 26.패키지
 * 같은 패키지에 있는 클래스는 import 없이 사용할 수 있으나,
 * 다른 패키지에 있는 클래스는 import 문을 이용해서 어떤 패키지의 클래스를 사용하는지 명시해야 한다.
 * import 문이 작성되는 위치는 패키지 선언과 클래스 선언 사이이다.
 *
 * 		import 클래스전체이름;
 */
//import 문으로 다른 패키지 클래스 사용을 명시
// 만약 동일한 패키지에 다수의 클래스를 사용하는 경우 클래스명을 생략하고 *을 사용할 수 있다.
import ch06.Ex12.hankook.*;
import ch06.Ex12.kumho.AllSeasonTire;
/**
 * 패키지(Package)
 *  - 클래스의 일부분이며, 클래스를 식별하는 용도로 사용된다.
 *  -> 클래스의 전체 이름에 포함된다.
 *  - 상위 패키지와 하위 패키지는 도트(.)로 구분한다.
 *  	예) com.mycompany -> com는 상위 패키지, mycompany는 하위 패키지
 *
 * 패키지 선언
 * 	 - 항상 소스 파일의 최상단에 위치해야 한다.
 *   - 패키지 이름은 소문자로 작성한다. (관례)
 *   - 개발 회사 도메인 이름의 역순으로 작성하고, 마지막에 프로젝트명을 붙인다.
 *
 * 		package 상위패키지.하위패키지;
 *
 * 		예) com.samsung.프로젝트명
 * 		예) org.apache.프로젝트명
 */
public class Car {
	// 어떤 패키지의 클래스를 사용할 지 결정할 수 없기 때문에 컴파일 에러 발생!
	//Tire trie = new Tire(); // 컴파일 에러

	//부품 필드 선언
	ch06.Ex12.hankook.Tire tire1 = new ch06.Ex12.hankook.Tire();
	// 클래스 전체 이름을 사용할 경우 import 문은 필요 없다.
	ch06.Ex12.kumho.Tire tire2 = new ch06.Ex12.kumho.Tire();
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();
}
