package es.jesusvegapic.TFGsteamingcorejava.domain.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public interface UploadVideoServiceInterface {

    public ResponseEntity<?> videoUpload(MultipartFile video) throws IOException;

}
