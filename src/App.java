void main()
{
    String ålder = IO.readln("Ange din ålder: ");
    
    //typkonvertering:

int ålders = Integer.parseInt(ålder);

if(ålders<18){
    IO.println("du är barn");
}
else if(ålders==18){
    IO.println("du är inte barn anymore");
}
else{
    IO.println("wow");
}

switch(ålders){
    case 18 -> IO.println("du är inte barn anymore typ");
    default -> IO.println("uh ok");
}
int varv = 0;
while (varv<10){
    IO.println("varv nr "+varv);
    varv = varv+1; 
}
}
