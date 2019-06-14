## casting (type conversion)
- 정수끼리 연산은 정수형으로만 반환 : result : 5/3;
- 다른 자료형끼리의 연산의 경우, 더 큰 범위의 연산으로 취급... result = 5 / 3.0;
- **자료형을 바꾸는 것을 캐스팅이라함.**  
double avg = (double)sum/10; (int --> double)
  
```
# 계산기 만들기~  
 Scanner sc = new Scanner(System.in);
       
 int a = sc.nextInt();  
 int b = sc.nextInt(); 

 double c = (double)a/b;
       
System.out.println(a+ " + "+b+" : "+(a+b));
System.out.println(a+ " - "+b+" : "+(a-b));
System.out.println(a+ " * "+b+" : "+(a*b));
System.out.println(a+ " / "+b+" : "+c);
System.out.println(a+ " % "+b+" : "+(a%b)); // 나머지는 정수 
```
 
