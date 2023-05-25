public class Box {
    
    public synchronized void cambiaGomma(String pilota){
        try{

            System.out.println("PIT-STOP " + pilota + " cambio gomme in corso");


            Thread.sleep((int)(1000*Math.random()+1));


        }
        catch(Exception e){

            System.out.println("errore box");


        }



    }










}
