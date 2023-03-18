package messagerosa.core.model;

public enum DeviceType {
    PHONE("phone"),
    FCM("fcm"),
    PHONE_PWA("ucipwa"),
    PHONE_FCM("phonefcm");
    

    private String name;

    DeviceType(String deviceType) {
        name=deviceType;
    }

    public String toString(){
        return name;
    }

    public static String getEnumByString(String code){
        for(DeviceType e : DeviceType.values()){
            if(e.name.equals(code)) return e.name();
        }
        return null;
    }
}
