package com.golfzon;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;


public class FileController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getServletPath());
        String dir_path = request.getServletContext().getRealPath("/upload");
        System.out.println("sdlfkjsdlkfj");

        System.out.println(dir_path);

        int fileSizeMax = 1024 * 1024 * 100;

        boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);

        // Multipart 요청이면 true, 일반요청이면 false

        if (isMultipartContent) {

            DiskFileItemFactory factory = new DiskFileItemFactory();
            factory.setSizeThreshold(fileSizeMax);

            ServletFileUpload sfu = new ServletFileUpload(factory);
            sfu.setFileSizeMax(fileSizeMax);//파일 사이즈 제한

            try {
                List<FileItem> items = sfu.parseRequest(request);
                System.out.println(items);
                for (FileItem item : items) {

                    if (item.isFormField()) { // name,age 받기

                        System.out.println("폼필드 키 : " + item.getFieldName());

                        System.out.println("폼필드 값 : " + item.getString("UTF-8"));

                    } else {//upFile받기

                        System.out.println("파일의 키 : " + item.getFieldName());
                        System.out.println("파일 파일명 : " + item.getName());
                        System.out.println("파일 컨텐츠 타입 : " + item.getContentType());
                        System.out.println("파일 사이즈  : " + item.getSize());

                        String fileName = FilenameUtils.getName(item.getName());

                        File saveFile = new File(dir_path, fileName);

                        try {
                            item.write(saveFile);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                }//end for loop

            } catch (FileUploadException e) {
                e.printStackTrace();
            }
        }//end if << isMultipartContent


    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost():");


    }
}
