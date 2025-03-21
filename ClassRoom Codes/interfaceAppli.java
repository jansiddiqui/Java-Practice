// You are using Java
interface Musicplayer{
    void play();
    void stop();
}
interface Camera{
    void clickpicture();
    void shootvideos();
}
interface Radio{
    void Search();
    void Autotune();
}
class Smartphone implements Musicplayer, Radio, Camera{
    public void play(){
        System.out.println("This is play from musicplayer");
    }
    public void stop(){
        System.out.println("This is stop from musicplayer");
    }
    public void clickpicture(){
        System.out.println("This is clickpicture from Camera");
    }
    public void shootvideos(){
        System.out.println("This is shootvideos from Camera");
    }
    public void Search(){
        System.out.println("This is search  from radio");
    }
    public void Autotune(){
        System.out.println("This is Autotune from radio");
    }
}
class interfaceAppli{
    public static void main(String[] args){
        Smartphone obj3 = new Smartphone();
        // Musicplayer obj = new Smartphone();
        obj3.play();
        obj3.stop();
        // Camera obj1 = new Smartphone();
        obj3.clickpicture();
        obj3.shootvideos();
        // Radio obj2 = new Smartphone();
        obj3.Search();
        obj3.Autotune();
    }
}