import java.util.Scanner; // импортируем класс
public class game {
	


    public static void main(String[] args) {
		int a = (int)(Math.random()*100) ; 
	int b = (int)(Math.random()*11) ; 
	Scanner aa = new Scanner(System.in); // создаём объект класса Scanner
	System.out.println("Vedite a") ;
	  String name = aa.nextLine();

Scanner ba = new Scanner(System.in); // создаём объект класса Scanner
	System.out.println("Vedite b") ;
	  String rasa = ba.nextLine();

Scanner ca = new Scanner(System.in); // создаём объект класса Scanner
	System.out.println("Vedite c") ;
	  String stolica = ca.nextLine();
	  System.out.println("Ваша сила = "+ b);
	
	  

	System.out.println("Наш Герой под именем " + name + " Который являлся "+ rasa + " Отправился в "+ stolica );
	System.out.println("Но вы замечаете  монстра ");
	System.out.println("У него 10 хп ");
    if (a > 50){
		System.out.println("Вы отнимаете "+ b + " хп");
	if(b > 5){
		System.out.println("Вы спугнули его");
	}
	else{
		System.out.println("Вы продолжаете атаковать");
	}
	}
    else
	{
		System.out.println("Вы промазываете  ");
	}
  
    } 	
}