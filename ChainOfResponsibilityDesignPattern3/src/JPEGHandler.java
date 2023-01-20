public class JPEGHandler extends BaseHandler{
    @Override
    public void HandRequest(Image image) {
        if (image.extension == "JPEG"){
            System.out.println("JPEG to PNG");
        } else  {
            sonrakiHandler.HandRequest(image);
        }
    }
}
