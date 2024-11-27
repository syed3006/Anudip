package labwork2;

class HillStations {


 public void location() {
     System.out.println("Location: Unknown");
 }

 public void famousFor() {
     System.out.println("Famous for: Unknown");
 }
}

//Subclass 1
class Manali extends HillStations {


 @Override
 public void location() {
     System.out.println("Location: Manali, Himachal Pradesh");
 }


 @Override
 public void famousFor() {
     System.out.println("Famous for: Snow-capped mountains, adventure sports");
 }
}


class Mussoorie extends HillStations {


 @Override
 public void location() {
     System.out.println("Location: Mussoorie, Uttarakhand");
 }

 @Override
 public void famousFor() {
     System.out.println("Famous for: Pleasant weather, colonial architecture");
 }
}

class Gulmarg extends HillStations {


 @Override
 public void location() {
     System.out.println("Location: Gulmarg, Jammu & Kashmir");
 }


 @Override
 public void famousFor() {
     System.out.println("Famous for: Skiing, lush green meadows");
 }
}

public class Hillstation {
 public static void main(String[] args) {

     HillStations hillStation = new HillStations();
     HillStations manali = new Manali();
     HillStations mussoorie = new Mussoorie();
     HillStations gulmarg = new Gulmarg();

     System.out.println("Using Parent Class reference:");
     hillStation.location();
     hillStation.famousFor();
     System.out.println();


     System.out.println("Using Subclass references:");
     manali.location();
     manali.famousFor();
     System.out.println();

     mussoorie.location();
     mussoorie.famousFor();
     System.out.println();

     gulmarg.location();
     gulmarg.famousFor();
 }
}
