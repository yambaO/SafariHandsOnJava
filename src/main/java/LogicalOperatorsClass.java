public class LogicalOperatorsClass {
   public static void main ( String[] arg){
       boolean isRaining = true;
       boolean isWarm = false;
//       boolean combined = isRaining && isWarm;
       boolean combined  = isRaining && isWarm;
       System.out.println("is raining and warm?: " + combined);
       combined = isRaining || isWarm;
       System.out.println("is rain or warm?: " + combined);
       combined = !isRaining;
       System.out.println("is not raining? :" + combined);


   }
}
