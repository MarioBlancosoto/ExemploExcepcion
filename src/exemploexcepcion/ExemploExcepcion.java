
package exemploexcepcion;


public class ExemploExcepcion {

   
    public static void main(String[] args) {
       Division obx = new Division();
       
     
      
       //obx.dividirConTryCatch(5,2);
      try{
       obx.dividirIntervaloExcepcion(180,20);
       obx.dividirNosaExcep(5, 3);
      }catch(NosaExcepcion e){
          System.out.println(e.getMessage());
      }catch(IntervaloExcepcion p){
          System.out.println(p.getMessage());
      }
        System.out.println("*********");

}
}