package kutluaycomp.hrms.core.adapters.imageManager;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
	String upload(MultipartFile file);

}
