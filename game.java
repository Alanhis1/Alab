import java.util.Scanner; // èìïîðòèðóåì êëàññ
public class game {
	


    public static void main(String[] args) {
		int a = (int)(Math.random()*100) ; 
	int b = (int)(Math.random()*11) ; 
	Scanner aa = new Scanner(System.in); // ñîçäà¸ì îáúåêò êëàññà Scanner
	System.out.println("Vedite a") ;
	  String name = aa.nextLine();

Scanner ba = new Scanner(System.in); // ñîçäà¸ì îáúåêò êëàññà Scanner
	System.out.println("Vedite b") ;
	  String rasa = ba.nextLine();

Scanner ca = new Scanner(System.in); // ñîçäà¸ì îáúåêò êëàññà Scanner
	System.out.println("Vedite c") ;
	  String stolica = ca.nextLine();
	  System.out.println("Âàøà ñèëà = "+ b); //I Hack you gode =))))
	  /////hjhuhuhuhu
	
	  

	System.out.println("Íàø Ãåðîé ïîä èìåíåì " + name + " Êîòîðûé ÿâëÿëñÿ "+ rasa + " Îòïðàâèëñÿ â "+ stolica );
	System.out.println("Íî âû çàìå÷àåòå  ìîíñòðà ");
	System.out.println("Ó íåãî 10 õï ");
    if (a > 50){
		System.out.println("Âû îòíèìàåòå "+ b + " õï");
	if(b > 5){
		System.out.println("Âû ñïóãíóëè åãî");
	}
	else{
		System.out.println("Âû ïðîäîëæàåòå àòàêîâàòü");
	}
	}
    else
	{
		System.out.println("Âû ïðîìàçûâàåòå  ");
	}
  
    } 	
}
