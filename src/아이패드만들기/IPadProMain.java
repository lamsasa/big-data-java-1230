package 아이패드만들기;

public class IPadProMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IPadProMake iPad = new IPadProMake("iPad Pro");
            if(!iPad.continueOrder()) break;
            iPad.setScreen();
            iPad.setColor();
            iPad.setMemory();
            iPad.setNetWork();
            iPad.setName();
            iPad.setSerialNum();
            iPad.inProductPad();
            iPad.productPad();

            //System.out.println(iPad.serialNum);
        }
    }
}
