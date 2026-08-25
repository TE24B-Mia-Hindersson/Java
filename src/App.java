import java.util.Random;

void main() {
    Random rand = new Random();
    int randomnr = rand.nextInt(9) + 1;
    
    IO.println("du ska gissa ett nr från 1-10, du har 3 försök:");
    int varv = 0;
    while (varv < 3) {
        String answer = IO.readln("Ange din gissning: ");
        int siif = Integer.parseInt(answer);
        if (siif == randomnr) {
            IO.println("du fick rätt!!");
            break;
        } 
        else if (siif <= randomnr){
IO.println("siffra för låg :(!!");
        }
        else {
            IO.println("siffra för hög");
        }
        varv++;
    }
    IO.println("Siffran var: " +randomnr );
}
