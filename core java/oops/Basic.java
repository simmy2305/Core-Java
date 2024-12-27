1.import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }
    }
}

2.import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if(a>10){
            System.out.println("valid input : "+a);
        }
        else{
            System.out.println("not valid");
        }
    }
}

3.import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("a is greater : "+a);
        }
        else if(b>a){
            System.out.println("b is greater : "+b);
        }
    }
}
4.import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        System.out.println("enter value of c");
        int c = sc.nextInt();
        if(a>b&&a>c){
            System.out.println("a is greater : "+a);
        }
        else if(b>a&&b>c){
            System.out.println("b is greater : "+b);
        }
        else if(c>a&&c>b){
            System.out.println("c is greater : "+c);
        }
    }
}
5.import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        System.out.println("enter value of c");
        int c = sc.nextInt();
        System.out.println("enter value of d");
        int d = sc.nextInt();
        System.out.println("enter value of e");
        int e = sc.nextInt();
        if(a>b&&a>c&&a>d&&a>e){
            System.out.println("a is greater : "+a);
        }
        else if(b>a&&b>c&&b>d&&b>e){
            System.out.println("b is greater : "+b);
        }
        else if(c>a&&c>b&&c>d&&c>e){
            System.out.println("c is greater : "+c);
        }
        else if(d>a&&d>b&&d>c&&d>e){
            System.out.println("d is greater : "+d);
        }
        else if(e>a&&e>b&&e>c&&e>d){
            System.out.println("e is greater : "+e);
        }
    }
}
6.import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        if(a>1){
            System.out.println("positive integar");
        }
        else if(a<1){
            System.out.println("negative integar");
        }
        else if(a==0){
            System.out.println("zero");
        }
    }
}
7.import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a alphabet");
        char a = sc.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonent");
        }
    }
}
8.import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if(a%5==0&&a%11==0){
            System.out.println("divisible by both");
        }
        else if(a%5==0||a%11==0) {
            System.out.println("divisible by one only");
        }
        else{
            System.out.println("not divisible");
        }
    }
}

9.import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a alphabet");
        char a = sc.next().charAt(0);
        if(a>='A'&&a<='Z'){
            System.out.println("uppercase");
        }
        else{
            System.out.println("lowercase");
        }
    }
}
10.import java.util.*;
public class Basic {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
    int n=sc.nextInt();
    if(n%7==0 && n%3==0){
        System.out.println(n+" is divisible by both 7 and 3");
    }
    else {
        System.out.println(n+" is not divisible by both 7 and 3");
    }
        
          
}
}

11. without third variable------------>

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number");
        int a =sc.nextInt();
        System.out.println("enter second number");
        int b =sc.nextInt();
        int c=a+b;
        a=c-a;
        b=c-a;
        System.out.println(a);
        System.out.println(b);
        
    }
}
with third variable------------------->

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number");
        int a =sc.nextInt();
        System.out.println("enter second number");
        int b =sc.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
        
    }
}

12. import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your gender");
        char a =sc.next().charAt(0);
        if(a=='f'){
            System.out.println("female");
        }
        else if(a=='m'){
            System.out.println("male");
        }
        else{
            System.out.println("others");
        }
        
        
    }
}

13.import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int a =sc.nextInt();
        if(a==1){
            System.out.println("monday");
        }
        else if(a==2){
            System.out.println("tuesday");
        }
        else if(a==3){
            System.out.println("wednesday");
        }
        else if(a==4){
            System.out.println("thursday");
        }
        else if(a==5){
            System.out.println("friday");
        }
        else if(a==6){
            System.out.println("saturday");
        }
        else if(a==7){
            System.out.println("sunday");
        }
        
        
    }
}

14.import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int a =sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else if(a%2!=0){
            System.out.println("odd");
        
    }
}
}

15.import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a alphabet");
        char a =sc.next().charAt(0);
        if(a=='a'){
            System.out.println("apple");
        }
        else if(a=='b'){
            System.out.println("ball");
        }
        else if(a=='c'){
            System.out.println("c");
        }
        else{
            System.out.println("others");
        }
}
}





