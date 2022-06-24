class Main {
  public static void main(String[] args) {
    System.out.println("Hello, Children! Welcome to the world of Magic, so Let's get started!!!");
    System.out.println("");
    System.out.println("Here are the rules: Choose any integer, double it, add six, divide it in half, and subtract the number you started with. The answer is always three!");
    System.out.println("So here we go");
    System.out.println("");

    System.out.println("Chosen number: 4");
    
    int ChosenNumber = 4;
  
    int X = 4;

    System.out.println("");
    int Y= X * 2;
    System.out.println("You take the chosen number, in this case which is 4, and multiply it by 2. You would get " + Y +".");

    // 
    Y += 6;

    int D = Y/2;
    System.out.println("Then, you would take 8 and divide it by 2, and you would get " + D + "." );
    System.out.println("");

    D -= X;
    System.out.println("Last but not least, take the divided number and substract it from the original chosen number, and it would be as a result of " + D +".");
    
    System.out.println("TAA-DAA, MAGIC!!");


  }
}