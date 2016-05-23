import java.io.*;

class Ikea {
public static void main(String[] args){

Store store = new Store();
Thread thread = new Thread(store);

thread.start();

}

}


class Store implements Runnable {

public void run(){

for(int i = 0; i < 10; i++){
System.out.println(i + " Stores are closing because IKEA sucks.");

try{
  Thread.sleep(1000);

}catch (InterruptedException e){
  break;
}


}

}





}
