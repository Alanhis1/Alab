import java.util.Scanner; // ����������� �����
public class game {
	


    public static void main(String[] args) {
		int a = (int)(Math.random()*100) ; 
	int b = (int)(Math.random()*11) ; 
	Scanner aa = new Scanner(System.in); // ������ ������ ������ Scanner
	System.out.println("Vedite a") ;
	  String name = aa.nextLine();

Scanner ba = new Scanner(System.in); // ������ ������ ������ Scanner
	System.out.println("Vedite b") ;
	  String rasa = ba.nextLine();

Scanner ca = new Scanner(System.in); // ������ ������ ������ Scanner
	System.out.println("Vedite c") ;
	  String stolica = ca.nextLine();
	  System.out.println("���� ���� = "+ b);
	
	  

	System.out.println("��� ����� ��� ������ " + name + " ������� ������� "+ rasa + " ���������� � "+ stolica );
	System.out.println("�� �� ���������  ������� ");
	System.out.println("� ���� 10 �� ");
    if (a > 50){
		System.out.println("�� ��������� "+ b + " ��");
	if(b > 5){
		System.out.println("�� �������� ���");
	}
	else{
		System.out.println("�� ����������� ���������");
	}
	}
    else
	{
		System.out.println("�� ������������  ");
	}
  
    } 	
}