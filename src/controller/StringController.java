package controller;

public class StringController {
    String content = "Example content: Lorem ipsum Loremipsum";

    public boolean isCharacter(char c) {
        int search = content.indexOf(c);
        return search != -1 ? true : false;
    }

    public int countAllCharacter(char c) {
        int counter = 0;
        for (int i = 0; i < content.length(); i++) {
            if(content.charAt(i)==c){
                counter++;
            }
        }
        return counter;
    }
    public int countUpperCases(){
        int upperUpperCases=0;
        for (int i = 0; i < content.length(); i++) {
            if((int)(content.charAt(i))>=65 && (int)content.charAt(i)<=90){
                upperUpperCases++;
            }
        }
        return  upperUpperCases;
    }
    public String reverse(){
        String _temp="";
        for(int i=content.length()-1;i>0;i--){
            _temp+=content.charAt(i);
        }
        return _temp;
    }
}
