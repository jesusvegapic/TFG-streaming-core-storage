package es.jesusvegapic.TFGsteamingcorejava.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class File {
    private String id;
    private String fileName;
    private long videoLength;
    private String videoUploadedBy;
    private String titleOfVideo;
    private String captionOfVideo;
    private String uploadTime;
    private String genreOfVideo;
    private long likesOnVideo;
    private long dislikesOnVideo;
}
