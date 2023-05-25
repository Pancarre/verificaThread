public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inizia Gara");


        semaforo s = new semaforo();
        Box b= new Box();
        monoposto p1 = new monoposto(1,"ferrari","Botez",s,b);
        monoposto p2 = new monoposto(1,"ferrari","pan",s,b);
        monoposto p3 = new monoposto(1,"ferrari","Iriarte",s,b);



        p1.start();
        p2.start();
        p3.start();



        p1.join();
        p1.join();
        p1.join();

        
        System.out.println("Fine Gara");


    }
}
