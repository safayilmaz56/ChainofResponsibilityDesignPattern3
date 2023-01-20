public class JPGHandler extends BaseHandler{
    @Override
    public void HandRequest(Image image) {
        if(image.extension == "JPG"){
            System.out.println("JPG to PNG");
        }
        else {
            sonrakiHandler.HandRequest(image);
        }
    }
}
