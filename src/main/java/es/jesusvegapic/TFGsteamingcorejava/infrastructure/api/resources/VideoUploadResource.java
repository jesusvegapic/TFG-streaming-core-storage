package es.jesusvegapic.TFGsteamingcorejava.infrastructure.api.resources;

import es.jesusvegapic.TFGsteamingcorejava.domain.services.UploadVideoServiceInterface;
import es.jesusvegapic.TFGsteamingcorejava.infrastructure.api.Rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

// Recurso para subir videos a la plataforma.
@Rest
@RequestMapping("/video")
public class VideoUploadResource {

    @Autowired
    private UploadVideoServiceInterface uploadVideoService;

    // LLamada a la API para subir un video.
    @PostMapping(value = "/upload")
    public ResponseEntity<?> videoUpload(@RequestParam("video") MultipartFile video) throws IOException {
        return uploadVideoService.videoUpload(video);
    }
}
