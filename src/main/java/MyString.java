
public class MyString {
	private final String myString;
	MyString(String newString) {
		myString = newString;
	}
	public int compareTo(String strToC) {
		try {
                        //Nodo1
			if (strToC.length()!=myString.length())
                            //Nodo2
                           throw new Exception();
                        //Nodo3
			for(int i=0;i<strToC.length();i++){
                            //Nodo5
                            if (!strToC.substring(i, i+1).equals(myString.substring(i, i+1)))
                                //Nodo6
                                throw new Exception();
                        }
                        //Nodo4
                        return 1;
		}
		catch(Exception Ex) {
                        //Nodo7
			return 0;
		}
	}

}
