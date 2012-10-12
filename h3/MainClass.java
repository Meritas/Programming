/*
#school - ТУЕС
#class - 11Б
#num - 19
#name - Йоан Методиев Марков
#task - Да се създаде програма, която да изкарва на екрана стойността на системните свойства по
зададени от командния ред имена на свойствата. Програмата трябва да приема и
невалидни имена. Ако последния подаден аргумент от командния ред е up то стойностите
показани в изхода трябва да са сортиран във възходящ ред. Ако последната стойност е
down изходът трябва да е сортиран в низходящ ред. Стойността по подразбиране, ако не е
посочено up или down, е up.
*/

import java.util.Arrays;
import java.util.*;

public class MainClass{

  public static void main(String[] args){
	int is = 0;
	ArrayList<String> al = new ArrayList<String>();
	for(String str : args){
	    is=0;
	    if(str.equals("down")){
            is=1;
        }
	    if(System.getProperty(str) != null) {
	        al.add(System.getProperty(str));
	    } 
	        }	
	    Object arr[] = al.toArray();
	    if(is==1){
	        Arrays.sort(arr, Collections.reverseOrder());
	}else {
	    Arrays.sort(arr);}
	    System.out.println(Arrays.toString(arr));
	}
	

}
