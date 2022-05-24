package messagerosa.core.model;

public enum StylingTag {
	LIST("list"), 
	QUICKREPLYBTN("buttonsForListItems"),
	IMAGE("image"),
	AUDIO("audio"),
	VIDEO("video"),
	DOCUMENT("document"),
	IMAGE_URL("image_url"),
	AUDIO_URL("audio_url"),
	DOCUMENT_URL("document_url"),
	VIDEO_URL("video_url"),
	TEXT("text");

	private String name;

	StylingTag(String stylingTag) {
	    name=stylingTag;
	}

	public String toString() {
		return name;
	}
	
	public static StylingTag getEnumByText(String code) {
		for (StylingTag e : StylingTag.values()) {
			if (e.name.equals(code))
				return e;
		}
		return null;
	}
}