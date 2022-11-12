package test.com.fileupload;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestMultipartFAOimpl implements TestMultipartFAO {
	private static final Logger logger = LoggerFactory.getLogger(TestMultipartFAOimpl.class);
	@Autowired
	private ServletContext context;

	@Override
	public TestVO getVO(TestVO vo) {
		logger.info("getVO....");
		logger.info("{}",vo);
		
		// vo에 맵핑을 위한 빈등록-root-context.xml << multipartResolver
		logger.info("{} byte", vo.getMultipartFile().getSize());

		if (vo.getMultipartFile().getSize() > 0) {
			logger.info("{}", vo.getMultipartFile().getOriginalFilename());
			vo.setImgName(vo.getMultipartFile().getOriginalFilename());

			String dir_path = context.getRealPath("resources/upload");
			logger.info(dir_path);

			File saveFile = new File(dir_path, vo.getImgName());

			String formatName = vo.getImgName().substring(vo.getImgName().lastIndexOf(".") + 1);
			logger.info("formatName:{}", formatName);

			try {
				vo.getMultipartFile().transferTo(saveFile);// 원본이미지 저장
				//// create thumbnail image/////////
				BufferedImage original_buffer_img = ImageIO.read(saveFile);
				BufferedImage thumb_buffer_img = new BufferedImage(100, 100, BufferedImage.TYPE_3BYTE_BGR);
				Graphics2D graphic = thumb_buffer_img.createGraphics();
				graphic.drawImage(original_buffer_img, 0, 0, 100, 100, null);

				File thumb_file = new File(dir_path, "thumb_" + vo.getImgName());
				ImageIO.write(thumb_buffer_img, formatName, thumb_file);

			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // 파일이 넘어왔을때만 처리하는 분기.
		return vo;
	}

}
