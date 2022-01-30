package domain;

public class Post {
    private int id; //
    private int ownerId; //
    private int createdBy; //

    private Header header; //

    private TextWithImage text; //


    private LikesInfo like; //
    private CommentsInfo comment; //
    private ViewsInfo view; //
    private String postType; //
    private int signerId; //
    private boolean canPin; //
    private boolean canDelete; //
    private boolean canEdit; //
    private boolean isPinned; //
    private boolean markedAsAds; //
    private boolean isFavorite; //
    private int postponedId; //
}
