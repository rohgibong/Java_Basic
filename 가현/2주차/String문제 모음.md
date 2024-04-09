### Q1.

문자열 입력받고 특정 문자 입력 받아서 해당 문자열에 특정 문자가 몇 개 있는지 나타내는 프로그램 작성하시오.

대소문자 구분하지 않는다.



예시)

DaramGda

d

답 : 2



### Q2.

문제 : 대문자는 소문자로, 소문자는 대문자로 변환하여 출력하라



예시 입력 : daramG -> DARAMg



### Q3.

입력받은 해당 문자열이 회문 문자열(앞과 뒤에서 읽앞과 뒤에서 읽을 때 같은 문자열)이면 "YES", 아니라면 "NO"를 출력한다.

회문을 검사할 때 대소문자를 구분하지 않는다.

**참고**

1. 문자열의 중간 지점 / 2 하고 그 왼쪽 문자들이 오른쪽 문자들과 대칭해서 같은지 검사
2. StringBuilder로 문자열 뒤집은 다음 뒤집기 전 문자열이랑 같은지 검사



### A1.

```java
import java.util.*;

class Main {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == t) answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		// System.in은 사용자로부터 입력을 받기 위한 입력 스트림
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		// charAt : String을 index로 접근
		char c = kb.next().charAt(0);

		System.out.print(T.solution(str, c));
	}
}
```

 

작성한 코드에서 

for(int i=0; i<str.length(); i++) {
  if(str.charAt(i) == t) answer++;
}

부분을

for(char x : str.toCharArray()) {

  if (x==t) answer++;

}

로 작성해도 된다.

 

for each문을 사용한 것이다.

근데 위 코드에서

여기 올 것들은 배열, 이터레이터를 제공하는 컬렉션 프레임워크들 (Arraylist, List 등..) 이 와야한다.

String은 올 수 없다. 따라서 문자 한 개 한 개를 분리해서 문자를 원소로하는 문자 배열을 만들어야 한다.

String을 문자 배열로 만들어주는 toCharArray를 이용한다.



### A2.

```java
import java.util.*;

class Main {
	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		System.out.println(T.solution(str));
	}
}
```



### A3.

#### 1번 풀이

```java
import java.util.*;

class Main {
	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return "NO";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
```

 

#### 2번 풀이

```java
import java.util.*;

class Main {
	public String solution(String str) {
		String answer = "NO";
		String reverseStr = new StringBuilder(str).reverse().toString();
		if (str.equalsIgnoreCase(reverseStr)) {
			return "YES";
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
```

 

 