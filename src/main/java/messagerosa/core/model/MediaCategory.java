package messagerosa.core.model;

public enum MediaCategory {
	IMAGE("image"),
	AUDIO("audio"),
	VIDEO("video"),
	VOICE("voice"),
    IMAGE_URL("image_url"),
    AUDIO_URL("audio_url"),
    VIDEO_URL("video_url"),
    VOICE_URL("voice_url"),
	FILE("file"),
    FILE_URL("file_url");

    private String name;

    MediaCategory(String mediaCategory) {
        name=mediaCategory;
    }

    public String toString(){
        return name;
    }

    public static String getEnumByString(String code){
        for(MediaCategory e : MediaCategory.values()){
            if(e.name.equals(code)) return e.name();
        }
        return null;
    }
}
