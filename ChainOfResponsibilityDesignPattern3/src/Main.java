public class Main {
    public static void main(String[] args) {
        Image image = new Image("fotom","JPG");

        JPEGHandler jpegHandler = new JPEGHandler();

        JPGHandler jpgHandler = new JPGHandler();
        CustomerHandler customerHandler = new CustomerHandler();
        jpegHandler.setSonrakiHandler(jpgHandler);
        jpgHandler.setSonrakiHandler(customerHandler);

        jpegHandler.HandRequest(image);
    }
}