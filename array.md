## 배열 (array)
- int array[10] 
- int a,b,c,d,e,f,g,h,i,j

## 2차원 배열
- int array[5][5] ( 5 by 5 )   
![image](https://user-images.githubusercontent.com/32521173/59765857-f5beee00-92d9-11e9-878b-dd9816cdb78e.png)

## java의 배열 선언  
  
```
//타입[] 변수명으로 선언
int [] numberArray;


//타입 변수명 [] 으로 선언
int numberArray[];


//특정 값 대입하며 배열 선언
int [] intArray = { 1, 2, 3, 4 };
int [] intArray = new int [] { 1, 2, 3, 4 };


//객체이므로 doubleArray에는 null이 대입된다.
double [] doubleArray;


//배열 생성해 할당하면(초기화) 배열의 주소가 들어가게 된다.
doubleArray = new double[10];


//Boolean 형태로 배열을 선언하고 초기화하는 예제
boolean [] bitList;
bitList = new boolean[10]; //기본값으로 초기화
Arrays.fill(bitList, false); //특정 값으로 초기화


//배열의 길이
bitList.length // 10
```
  

## 출처  
- https://programmingsummaries.tistory.com/28  
  
