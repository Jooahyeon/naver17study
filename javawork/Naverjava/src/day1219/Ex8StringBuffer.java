package day1219;

public class Ex8StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Happy";
		//String -> StringBuffer
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb);
		//인스턴스변수인 경우 변수명만 출력시 자동으로 toString()이 호출
		//toString을 갖고 있지 않는 경우 값이 아닌 주소가 출력된다
		System.out.println(sb);
		System.out.println(sb.toString());

		//String은 값 자체를 변경할 수 없지만 stringBuffer는 문자열 편집이 가능하다
		//맨뒤에 추가
		sb.append('A');
		sb.append(100);
		sb.append("Bitcamp");
		System.out.println(sb);
		
		//삭제
		sb.delete(5, 9);//5~8인덱스 부분이 제거(기존문자열에서 중간제거)
		System.out.println(sb);
		
		//중간삽입
		sb.insert(3, "Java"); //3번 인덱스 중간에 문자열 삽입
		System.out.println(sb);
		
		//중간의 문자열 변경
		sb.replace(3, 7, "Hello");
		System.out.println(sb);
		
		//데이터를 json데이터로 변환
		String name = "캔디";
		int age = 23;
		StringBuffer sb2 = new StringBuffer();
		sb2.append("{\"name\":");
		sb2.append("\""+name+"\",");
		sb2.append("\"age\":");
		sb2.append(age+"}");
		
		System.out.println(sb2);
		
	}

}
