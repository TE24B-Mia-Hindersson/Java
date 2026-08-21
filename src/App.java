import java.util.Random;

void main()
{
Random rand = new Random();
int randomnr = rand.nextInt(9) + 1;
IO.println("du ska gissa ett nr från 1-10, du har 3 försök:");
int varv = 0;
while (varv<3)
{
String answer = IO.readln("Ange din gissning: ");
 int siif = Integer.parseInt(answer);
if ( siif == randomnr)
{
    IO.println("du fick rätt!!");
}
else if (siif != randomnr) 
    {
    IO.println("du fick fel!");
} 
else {
     IO.println("fuck you");
}
varv ++;
}
}







// void main()
// {
//     String ålder = IO.readln("Ange din ålder: ");
    
//     //typkonvertering:

// int ålders = Integer.parseInt(ålder);

// if(ålders<18){
//     IO.println("du är barn");
// }
// else if(ålders==18){
//     IO.println("du är inte barn anymore");
// }
// else{
//     IO.println("wow");
// }

// switch(ålders){
//     case 18 -> IO.println("du är inte barn anymore typ");
//     default -> IO.println("uh ok");
// }
// int varv = 0;
// while (varv<10){
//     IO.println("varv nr "+varv);
//     varv = varv+1; 
// }
// }

