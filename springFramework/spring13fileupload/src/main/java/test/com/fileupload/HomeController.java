package test.com.fileupload;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	ServletContext context;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String insert() {
		logger.info("Welcome insert.do");

		return "member/insert";
	}

	@RequestMapping(value = "/insertOK.do", method = RequestMethod.POST)
	public String insertOK(TestVO vo, HttpServletRequest request) {
		logger.info("Welcome insertOK.do");
		logger.info("{}", vo);//vo에 맵핑이 이루어지지낳는다.

		
		//jsp_servlet에서 사용하던 소스로 구현하기....
		String dir_path = context.getRealPath("resources/upload");
		logger.info(dir_path);

		int fileSizeMax = 1024 * 1024 * 100;

		boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);

		if (isMultipartContent) {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setSizeThreshold(fileSizeMax);

			ServletFileUpload sfu = new ServletFileUpload(factory);
			sfu.setFileSizeMax(fileSizeMax);// 파일 사이즈 제한

			String name = "";
			int age = 0;
			String imgName = "";

			try {
				List<FileItem> items = sfu.parseRequest(request);
				for (FileItem item : items) {
					if (item.isFormField()) { // name,age 받기
						if (item.getFieldName().equals("name")) {
							name = item.getString("UTF-8");
						}
						if (item.getFieldName().equals("age")) {
							age = Integer.parseInt(item.getString("UTF-8"));
						}

					} else {

						imgName = FilenameUtils.getName(item.getName());

						File saveFile = new File(dir_path, imgName);

						try {
							item.write(saveFile);
						} catch (Exception e) {
							e.printStackTrace();
						}

					} // end else

				} // end for << items
			} catch (FileUploadException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

			logger.info("name:" + name);
			logger.info("age:" + age);
			logger.info("imgName:" + imgName);

		} // end if << isMultilpart

		return "redirect:selectAll.do?imgName=img_0001.png";
	}
	@RequestMapping(value = "/insertOK2.do", method = RequestMethod.POST)
	public String insertOK2(TestVO vo) {
		logger.info("Welcome insertOK2.do");
		logger.info("{}", vo);
		//vo에 맵핑을 위한 빈등록-root-context.xml << multipartResolver
		
		logger.info("{} byte", vo.getMultipartFile().getSize());
		
		if(vo.getMultipartFile().getSize() > 0) {
			logger.info("{}", vo.getMultipartFile().getOriginalFilename());
			vo.setImgName(vo.getMultipartFile().getOriginalFilename());
			
			String dir_path = context.getRealPath("resources/upload");
			logger.info(dir_path);
			
			
			File saveFile = new File(dir_path, vo.getImgName());
			
			String formatName = vo.getImgName().substring(vo.getImgName().lastIndexOf(".")+1);
			logger.info("formatName:{}",formatName);
			
			try {
				vo.getMultipartFile().transferTo(saveFile);//원본이미지 저장
				//// create thumbnail image/////////
				BufferedImage original_buffer_img = ImageIO.read(saveFile);
				BufferedImage thumb_buffer_img = new BufferedImage(100, 100, BufferedImage.TYPE_3BYTE_BGR);
				Graphics2D graphic = thumb_buffer_img.createGraphics();
				graphic.drawImage(original_buffer_img, 0, 0, 100, 100, null);
				
				File thumb_file = new File(dir_path, "thumb_"+vo.getImgName());
				ImageIO.write(thumb_buffer_img, formatName, thumb_file);
				
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//파일이 넘어왔을때만 처리하는 분기.
		
		return "redirect:selectAll.do?imgName="+vo.getImgName();
	}

	@RequestMapping(value = "/selectAll.do", method = RequestMethod.GET)
	public String selectAll(Model model) {
		logger.info("Welcome selectAll.do");

		model.addAttribute("vos", "vos");

		return "member/selectAll";
	}

}
