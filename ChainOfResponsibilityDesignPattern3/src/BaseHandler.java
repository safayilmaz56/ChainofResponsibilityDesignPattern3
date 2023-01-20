public abstract class BaseHandler {

    protected BaseHandler sonrakiHandler;
    public void setSonrakiHandler(BaseHandler sonrakiHandler){
        sonrakiHandler = sonrakiHandler;
    }
    public abstract void HandRequest(Image image);
}
