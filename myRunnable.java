public class myRunnable implements Runnable {
    @Override
    public void run(){
        for(int i =1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
            System.out.println("Thread was Interupted");    
            }
            if(i==10){
                System.out.println("Times UP Nigga!!!");
                System.exit(0);
            }
        }
    }
}
