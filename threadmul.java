package asd.me;
//thread creation by implementing the Runnable Interface 
class runnabledemo implements Runnable{
    private Thread t;
    private String threadname;
    runnabledemo(String name){
        threadname=name;
        System.out.println("Creating"+threadname);

    }
    public void run(){
        System.out.println("running"+threadname);//displaying the thread that is runneing
        try{
            for(int i=0;i>0;i--){
                System.out.println("Thread"+threadname+i);
                Thread.sleep(50);
                
            }

        }
        catch(InterruptedException e){//throwing an exception
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


public class threadmul {//mainclass
    public static void main(String[] args) {
        runnabledemo r1=new runnabledemo("Thread 1");
        r1.start();
        runnabledemo r2= new runnabledemo("Thread 2");
        r2.start();
        
    }
    
}
