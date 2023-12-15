import java.util.Scanner;
import java.util.scanner ;
import java.util.reges.matcher;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sound.sampled.SourceDataLine;
 
public class EmailValidator{
    Scanner scanner=new scanner(system.in );
    System.out.print("Enter an Emailaddresss");
    String Email=Scanner.Nextline ();
    if(isvalidemail(email)){
       System.out.print("Valid Emailaddresss");
 
    }
    else {System.out.print("inValid Emailaddresss");


    }
     private static boolean isvalidemail(stringemail){
        Stringemailregex=[a,s,d,f,g,h,j,k,l,q,w,e,r,t,y,u,i,o,p,z,x,c,v,bn,m]+[!,@<#,$,%,];
        Pattern pattern=Patterncompile(Emailregex);
        Matcher matcher=Patternmatcher(Email);
        Return matcher.matches();
     }
     }