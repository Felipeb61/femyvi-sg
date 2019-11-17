package connection;

public enum Ports {
    
    HEALTHCHECK(3000),
    DOWNLOAD(3001),
    REMOVE(3002),
    UPLOAD(3003),
    DOWNLOAD_SA_1(4002),
    DOWNLOAD_SA_2(4003),
    REMOVE_SA_1(4004),
    REMOVE_SA_2(4005),
    UPLOAD_SA_1(4006),
    UPLOAD_SA_2(4007);
    
    private final int value;
    
    Ports(int portValue){
        value = portValue;
    }
    
    public int getValue(){
        return value;
    }
    
}
