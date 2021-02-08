package asd.me;
class runnabledemo implements Runnable{
    private Thread t;
    private String threadname;
    runnabledemo(String name){
        threadname=name;
        System.out.println("Creating"+threadname);

    }
    public void run(){
        System.out.println("running"+threadname);
        try{
            for(int i=0;i>0;i--){
                System.out.println("Thread"+threadname+i);
                Thread.sleep(50);
                
            }

        }
        catch(InterruptedException e){
            System.out.println("Thread"+threadname+"interrupted");
        }
        System.out.println("Thread"+threadname+"existing");

    }
    public void start(){
        System.out.println("Starting"+threadname);
        if(t==null){
            t=new Thread(this,threadname);
            t.start();
        }
    }
    
}


public class threadmul {
    public static void main(String[] args) {
        runnabledemo r1=new runnabledemo("Thread 1");
        r1.start();
        runnabledemo r2= new runnabledemo("Thread 2");
        r2.start();
        
    }
    
}
