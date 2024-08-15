import java.util.*;
class helpmeineedsleep
  {
    public static void main(String args[])
    {
      Scanner in =new Scanner(System.in);
     //what is life
      //i do not sir
    //why he dreams despite everything
     //perhaps he seeks someone
    //perhaps..perhaps...
    int n;
    System.out.println("enter input");
    String inp= in.nextInt();
    int i,j,k=0,w=0;
    // i and j are loop variables while k and w are flag variable
    for(i=0;i<inp.length();i++)
      {
        if(Character.isDigit(inp.charAt(i))==true)
        {
          k=1;
          break;
        }
      }
      //why does he do what he does
      for(i=0;i<inp.length();i++)
        {
          if(inp.charAt(i)!=inp.charAt((inp.lenght()-1)-i)
             {
              w=1;
              break;
          }
        }
      //i need sleep
    if(w=1){
      if(k=1)
        System.out.println("the number entered is palindrome, i need sleep");
      else
        System.out.println("the string entered is palindorme, i need sleep");
    }
    else{
      if(k=1)
        System.out.println("the number entered is not palindrome,now i want sleep");
      else
        System.out.println("the string entered is palindorme,now i want sleep");
    }

    //the strange comment lines are of something significant with a repo of mine called hello-world-in-every-language
