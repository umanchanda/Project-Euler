public class euler17{
  public static void main(String[] args) {
    final int one = 3;
    final int two = 3;
    final int three = 5;
    final int four = 4;
    final int five = 4;
    final int six = 3;
    final int seven = 5;
    final int eight = 5;
    final int nine = 4;
    final int and = 3;
    final int ten = 3;
    final int eleven = 6;
    final int twelve = 6;
    final int thirteen = 8;
    final int fourteen = 8;
    final int fifteen = 7;
    final int sixteen = 7;
    final int seventeen = 9;
    final int eighteen = 8;
    final int nineteen = 8;
    final int twenty = 6;
    final int thirty = 6;
    final int forty = 5;
    final int fifty = 5;
    final int sixty = 5;
    final int seventy = 7;
    final int eighty = 6;
    final int ninety = 6;
    final int hundred = 7;
    final int thousand = 8;
    
    final int firstnineteen = one + two + three + four + five + six + seven + eight + nine + ten + eleven + twelve + thirteen + fourteen + fifteen + sixteen + seventeen + eighteen + nineteen;
    final int firstnine = one + two + three + four + five + six + seven + eight + nine;
    final int twenties = firstnine + twenty*10;
    final int thirties = firstnine + thirty*10;
    final int forties = firstnine + forty*10;
    final int fifties = firstnine + fifty*10;
    final int sixties = firstnine + sixty*10;
    final int seventies = firstnine + seventy*10;
    final int eighties = firstnine + eighty*10;
    final int ninetees = firstnine + ninety*10;
    final int firstninetynine = firstnineteen + twenties + thirties + forties + fifties + sixties + seventies + eighties + ninetees;
    final int hundreds = one*100 + hundred*100 + and*100 + firstninetynine;
    final int twohundreds = two*100 + hundred*100 + and*100 + firstninetynine;
    final int threehundreds = three*100 + hundred*100 + and*100 + firstninetynine;
    final int fourhundreds = four*100 + hundred*100 + and*100 + firstninetynine;
    final int fivehundreds = five*100 + hundred*100 + and*100 + firstninetynine;
    final int sixhundreds = six*100 + hundred*100 + and*100 + firstninetynine;
    final int sevenhundreds = seven*100 + hundred*100 + and*100 + firstninetynine;
    final int eighthundreds = eight*100 + hundred*100 + and*100 + firstninetynine;
    final int ninehundreds = nine*100 + hundred*100 + and*100 + firstninetynine;
    final int onethousand = one + thousand;
    System.out.println(firstninetynine + hundreds + twohundreds + threehundreds + fourhundreds + fivehundreds + sixhundreds + sevenhundreds + eighthundreds + ninehundreds + onethousand);
  }
}
  
  