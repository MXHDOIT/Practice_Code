public class Laptop {
    public void run(){
        System.out.println("笔记本运行");
    }

    public void useUSB(USB usb){
        if(usb instanceof Mouse){
            Mouse u = (Mouse)usb;
            u.open();
            u.click();
            u.close();
        }

        if(usb instanceof KeyBoard){
            KeyBoard u = (KeyBoard)usb;
            u.open();
            u.type();
            u.close();
        }
    }

    public void close(){
        System.out.println("笔记本关闭");
    }
}
