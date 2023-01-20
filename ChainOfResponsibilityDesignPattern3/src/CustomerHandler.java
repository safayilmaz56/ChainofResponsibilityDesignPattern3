public class CustomerHandler extends BaseHandler{
    @Override
    public void HandRequest(Image image) {
        if (image.extension == "OtherExtension"){
            System.out.println("OtherExtension to PNG");

        }
    }
}
